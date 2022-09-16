package com.berktug.ws.file.vm;

import com.berktug.ws.file.FileAttachment;

import lombok.Data;

@Data
public class FileAttachmentVM {
	
	private String name;
	
	private String fileType;
	
	public FileAttachmentVM(FileAttachment fileAttachment) {
		this.setName(fileAttachment.getName());
		this.fileType = fileAttachment.getFileType();
	}

}
