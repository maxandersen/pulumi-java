// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SqlOutOfDiskReportResponse {
    /**
     * The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
     * 
     */
    private final Integer sqlMinRecommendedIncreaseSizeGb;
    /**
     * This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    private final String sqlOutOfDiskState;

    @OutputCustomType.Constructor
    private SqlOutOfDiskReportResponse(
        @OutputCustomType.Parameter("sqlMinRecommendedIncreaseSizeGb") Integer sqlMinRecommendedIncreaseSizeGb,
        @OutputCustomType.Parameter("sqlOutOfDiskState") String sqlOutOfDiskState) {
        this.sqlMinRecommendedIncreaseSizeGb = sqlMinRecommendedIncreaseSizeGb;
        this.sqlOutOfDiskState = sqlOutOfDiskState;
    }

    /**
     * The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
     * 
    */
    public Integer getSqlMinRecommendedIncreaseSizeGb() {
        return this.sqlMinRecommendedIncreaseSizeGb;
    }
    /**
     * This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
    */
    public String getSqlOutOfDiskState() {
        return this.sqlOutOfDiskState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlOutOfDiskReportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer sqlMinRecommendedIncreaseSizeGb;
        private String sqlOutOfDiskState;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlOutOfDiskReportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sqlMinRecommendedIncreaseSizeGb = defaults.sqlMinRecommendedIncreaseSizeGb;
    	      this.sqlOutOfDiskState = defaults.sqlOutOfDiskState;
        }

        public Builder setSqlMinRecommendedIncreaseSizeGb(Integer sqlMinRecommendedIncreaseSizeGb) {
            this.sqlMinRecommendedIncreaseSizeGb = Objects.requireNonNull(sqlMinRecommendedIncreaseSizeGb);
            return this;
        }

        public Builder setSqlOutOfDiskState(String sqlOutOfDiskState) {
            this.sqlOutOfDiskState = Objects.requireNonNull(sqlOutOfDiskState);
            return this;
        }
        public SqlOutOfDiskReportResponse build() {
            return new SqlOutOfDiskReportResponse(sqlMinRecommendedIncreaseSizeGb, sqlOutOfDiskState);
        }
    }
}
