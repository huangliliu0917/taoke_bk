package com.taoke.miquaner.serv;

import com.taoke.miquaner.data.EGuide;
import com.taoke.miquaner.data.EHelp;
import com.taoke.miquaner.data.EShareImg;

public interface IAppServ {

    Object listGuidesByType(Integer type);

    Object listGuides();

    Object setGuide(EGuide guide);

    Object removeGuide(Long id);

    Object listHelp();

    Object setHelp(EHelp help);

    Object removeHelp(Long id);

    Object listShareImgUrl();

    Object listShareImgUrl(Integer type);

    Object setShareImgUrl(EShareImg shareImg);

    Object removeShareImgUrl(Long id);

    Object getDownloadUrl(String key);

}
