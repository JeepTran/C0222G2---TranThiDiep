package service.service.impl;

import repository.service.IAttachServiceRepository;
import repository.service.impl.AttachServiceRepositoryImpl;
import service.service.IAttachServiceService;
public class AttachServiceServiceImpl implements IAttachServiceService {
  private IAttachServiceRepository attachServiceRepository = new AttachServiceRepositoryImpl();



}
