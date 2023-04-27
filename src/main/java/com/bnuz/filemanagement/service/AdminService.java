package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.model.Admin;

public interface AdminService extends BaseService<Admin> {

    Admin findByAdminName(Admin admin);
}
