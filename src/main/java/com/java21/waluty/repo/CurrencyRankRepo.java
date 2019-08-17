package com.java21.waluty.repo;

import com.java21.waluty.entity.CurrencyRank;
import com.java21.waluty.gui.CurrencyGui;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRankRepo extends JpaRepository <CurrencyRank, Long> {}