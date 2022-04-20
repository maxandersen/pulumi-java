// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorResponse {
    /**
     * Migration error
     * 
     */
    private final ReportableExceptionResponse error;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Result type
     * Expected value is &#39;ErrorOutput&#39;.
     * 
     */
    private final String resultType;

    @CustomType.Constructor
    private MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorResponse(
        @CustomType.Parameter("error") ReportableExceptionResponse error,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("resultType") String resultType) {
        this.error = error;
        this.id = id;
        this.resultType = resultType;
    }

    /**
     * Migration error
     * 
    */
    public ReportableExceptionResponse error() {
        return this.error;
    }
    /**
     * Result identifier
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Result type
     * Expected value is &#39;ErrorOutput&#39;.
     * 
    */
    public String resultType() {
        return this.resultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportableExceptionResponse error;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder error(ReportableExceptionResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }        public MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskOutputErrorResponse(error, id, resultType);
        }
    }
}
