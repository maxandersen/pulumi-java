// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * This message wraps up the information written by out-of-disk detection job.
 * 
 */
public final class SqlOutOfDiskReportResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlOutOfDiskReportResponse Empty = new SqlOutOfDiskReportResponse();

    /**
     * The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
     * 
     */
    @Import(name="sqlMinRecommendedIncreaseSizeGb", required=true)
    private Integer sqlMinRecommendedIncreaseSizeGb;

    public Integer sqlMinRecommendedIncreaseSizeGb() {
        return this.sqlMinRecommendedIncreaseSizeGb;
    }

    /**
     * This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @Import(name="sqlOutOfDiskState", required=true)
    private String sqlOutOfDiskState;

    public String sqlOutOfDiskState() {
        return this.sqlOutOfDiskState;
    }

    private SqlOutOfDiskReportResponse() {}

    private SqlOutOfDiskReportResponse(SqlOutOfDiskReportResponse $) {
        this.sqlMinRecommendedIncreaseSizeGb = $.sqlMinRecommendedIncreaseSizeGb;
        this.sqlOutOfDiskState = $.sqlOutOfDiskState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlOutOfDiskReportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlOutOfDiskReportResponse $;

        public Builder() {
            $ = new SqlOutOfDiskReportResponse();
        }

        public Builder(SqlOutOfDiskReportResponse defaults) {
            $ = new SqlOutOfDiskReportResponse(Objects.requireNonNull(defaults));
        }

        public Builder sqlMinRecommendedIncreaseSizeGb(Integer sqlMinRecommendedIncreaseSizeGb) {
            $.sqlMinRecommendedIncreaseSizeGb = sqlMinRecommendedIncreaseSizeGb;
            return this;
        }

        public Builder sqlOutOfDiskState(String sqlOutOfDiskState) {
            $.sqlOutOfDiskState = sqlOutOfDiskState;
            return this;
        }

        public SqlOutOfDiskReportResponse build() {
            $.sqlMinRecommendedIncreaseSizeGb = Objects.requireNonNull($.sqlMinRecommendedIncreaseSizeGb, "expected parameter 'sqlMinRecommendedIncreaseSizeGb' to be non-null");
            $.sqlOutOfDiskState = Objects.requireNonNull($.sqlOutOfDiskState, "expected parameter 'sqlOutOfDiskState' to be non-null");
            return $;
        }
    }

}
