package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.common.BaseServiceImpl;
import com.bnuz.filemanagement.mapper.AdminMapper;
import com.bnuz.filemanagement.model.Admin;
import com.bnuz.filemanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin, AdminMapper> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
}
