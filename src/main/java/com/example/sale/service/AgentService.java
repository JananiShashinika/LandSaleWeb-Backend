package com.example.sale.service;

import com.example.sale.dto.AgentDTO;
import com.example.sale.entity.Agent;
import com.example.sale.repo.AgentRepo;
import com.example.sale.util.VarList;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AgentService {

    @Autowired
    private AgentRepo agentRepo;

    @Autowired
    private ModelMapper modelMapper;


    public String saveAgent(AgentDTO agentDTO) {
        if (agentRepo.existsById(agentDTO.getAgentID())) {
            System.out.println("Response Duplicated - Already added ");
            // --- in util package VarList ---
            return VarList.Res_Duplicated_already_taken;

        } else {
            agentRepo.save(modelMapper.map(agentDTO, Agent.class));
            return VarList.Res_Success;
        }
    }

    public String updateAgent(AgentDTO agentDTO) {
        if(agentRepo.existsById(agentDTO.getAgentID())){
            agentRepo.save(modelMapper.map(agentDTO, Agent.class));
            return VarList.Res_Success;

        }else{
            return VarList.Res_Not_data_found;
        }
    }

//   public List<AgentDTO> getAllAgent() {           // To get all Agents' List
//
//    try{}
//    catch{}
//    }
//
//    public AgentDTO searchAgent(int AgentID){      // search agents by ID
//
//    }
//
//    public String deleteAgent(int AgentID){      // delete agents by ID
//
//    }
    // ALL THESE METHODS SHOULD BE CONTROLLED BY CONTROLLER  ------>


}