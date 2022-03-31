package io.mosip.registration.clientmanager.entity;

import androidx.room.ColumnInfo;

import java.sql.Timestamp;

import lombok.Data;

/**
 * The Entity Class for RegistrationCommonFields.
 *
 * @author Anshul vanawat
 */
@Data
public class RegistrationCommonFields {

    @ColumnInfo(name = "IS_ACTIVE")
    private Boolean isActive;
    @ColumnInfo(name = "CR_BY")
    protected String crBy;
    @ColumnInfo(name = "CR_DTIMES")
    protected Timestamp crDtime;
    @ColumnInfo(name = "UPD_BY")
    protected String updBy;
    @ColumnInfo(name = "UPD_DTIMES")
    protected Timestamp updDtimes;
}
