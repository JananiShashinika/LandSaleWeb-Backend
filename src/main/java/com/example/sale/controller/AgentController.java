package com.example.sale.controller;

import com.example.sale.dto.AgentDTO;
import com.example.sale.dto.ResponseDTO;
import com.example.sale.service.AgentService;
import com.example.sale.util.VarList;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @Autowired
    private ResponseDTO responseDTO;

    @PostMapping(value = "/saveAgent")
    public ResponseEntity saveAgent(@RequestBody AgentDTO agentDTO) {

        //Exception Handling'

        try{
            String res = agentService.saveAgent(agentDTO);
            if(res.equals("00")){ // if res Success
                responseDTO.setCode(VarList.Res_Success);
                responseDTO.setMessage("Success");
                responseDTO.setContent(agentDTO);
                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

            }else if(res.equals("06")) {        //if res Duplicates
                responseDTO.setCode(VarList.Res_Duplicated_already_taken);
                responseDTO.setMessage("Agent Registered");
                responseDTO.setContent(agentDTO);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }else{
                responseDTO.setCode(VarList.Res_Fail);
                responseDTO.setMessage("Error");
                responseDTO.setContent(null);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }


        }catch(Exception ex){
            responseDTO.setCode(VarList.Res_Error);
            responseDTO.setMessage(ex.getMessage());
            responseDTO.setContent(null);        // if null set as ex; it gives all details
            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);


        }
    }

    @PutMapping(value = "/updateAgent")
    public ResponseEntity updateAgent(@RequestBody AgentDTO agentDTO) {

        //Exception Handling'

        try{
            String res = agentService.updateAgent(agentDTO);
            if(res.equals("00")){ // if res Success
                responseDTO.setCode(VarList.Res_Success);
                responseDTO.setMessage("Success");
                responseDTO.setContent(agentDTO);
                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

            }else if(res.equals("06")) {        //if res Duplicates
                responseDTO.setCode(VarList.Res_Not_data_found);
                responseDTO.setMessage("Not a Registered Agent");
                responseDTO.setContent(agentDTO);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }else{
                responseDTO.setCode(VarList.Res_Fail);
                responseDTO.setMessage("Error");
                responseDTO.setContent(null);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }


        }catch(Exception ex){
            responseDTO.setCode(VarList.Res_Error);
            responseDTO.setMessage(ex.getMessage());
            responseDTO.setContent(null);        // if null set as ex; it gives all details
            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);


        }
    }
}