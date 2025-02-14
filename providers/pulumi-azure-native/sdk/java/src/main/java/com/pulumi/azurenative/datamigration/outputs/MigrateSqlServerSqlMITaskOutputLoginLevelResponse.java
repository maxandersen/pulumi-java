// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MigrateSqlServerSqlMITaskOutputLoginLevelResponse {
    /**
     * @return Login migration end time
     * 
     */
    private final String endedOn;
    /**
     * @return Login migration errors and warnings per login
     * 
     */
    private final List<ReportableExceptionResponse> exceptionsAndWarnings;
    /**
     * @return Result identifier
     * 
     */
    private final String id;
    /**
     * @return Login name.
     * 
     */
    private final String loginName;
    /**
     * @return Login migration progress message
     * 
     */
    private final String message;
    /**
     * @return Result type
     * Expected value is &#39;LoginLevelOutput&#39;.
     * 
     */
    private final String resultType;
    /**
     * @return Current stage of login
     * 
     */
    private final String stage;
    /**
     * @return Login migration start time
     * 
     */
    private final String startedOn;
    /**
     * @return Current state of login
     * 
     */
    private final String state;

    @CustomType.Constructor
    private MigrateSqlServerSqlMITaskOutputLoginLevelResponse(
        @CustomType.Parameter("endedOn") String endedOn,
        @CustomType.Parameter("exceptionsAndWarnings") List<ReportableExceptionResponse> exceptionsAndWarnings,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("loginName") String loginName,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("resultType") String resultType,
        @CustomType.Parameter("stage") String stage,
        @CustomType.Parameter("startedOn") String startedOn,
        @CustomType.Parameter("state") String state) {
        this.endedOn = endedOn;
        this.exceptionsAndWarnings = exceptionsAndWarnings;
        this.id = id;
        this.loginName = loginName;
        this.message = message;
        this.resultType = resultType;
        this.stage = stage;
        this.startedOn = startedOn;
        this.state = state;
    }

    /**
     * @return Login migration end time
     * 
     */
    public String endedOn() {
        return this.endedOn;
    }
    /**
     * @return Login migration errors and warnings per login
     * 
     */
    public List<ReportableExceptionResponse> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }
    /**
     * @return Result identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Login name.
     * 
     */
    public String loginName() {
        return this.loginName;
    }
    /**
     * @return Login migration progress message
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Result type
     * Expected value is &#39;LoginLevelOutput&#39;.
     * 
     */
    public String resultType() {
        return this.resultType;
    }
    /**
     * @return Current stage of login
     * 
     */
    public String stage() {
        return this.stage;
    }
    /**
     * @return Login migration start time
     * 
     */
    public String startedOn() {
        return this.startedOn;
    }
    /**
     * @return Current state of login
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskOutputLoginLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private List<ReportableExceptionResponse> exceptionsAndWarnings;
        private String id;
        private String loginName;
        private String message;
        private String resultType;
        private String stage;
        private String startedOn;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskOutputLoginLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.exceptionsAndWarnings = defaults.exceptionsAndWarnings;
    	      this.id = defaults.id;
    	      this.loginName = defaults.loginName;
    	      this.message = defaults.message;
    	      this.resultType = defaults.resultType;
    	      this.stage = defaults.stage;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder exceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }
        public Builder exceptionsAndWarnings(ReportableExceptionResponse... exceptionsAndWarnings) {
            return exceptionsAndWarnings(List.of(exceptionsAndWarnings));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder loginName(String loginName) {
            this.loginName = Objects.requireNonNull(loginName);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder stage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public MigrateSqlServerSqlMITaskOutputLoginLevelResponse build() {
            return new MigrateSqlServerSqlMITaskOutputLoginLevelResponse(endedOn, exceptionsAndWarnings, id, loginName, message, resultType, stage, startedOn, state);
        }
    }
}
