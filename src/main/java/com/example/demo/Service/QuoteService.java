package com.example.demo.Service;


import org.springframework.stereotype.Service;

import com.example.demo.payload.RequestData;

@Service
public interface QuoteService {

	Object findPremium(RequestData data);

}
