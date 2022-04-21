// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MigrateSqlServerSqlMITaskOutputLoginLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMITaskOutputLoginLevelResponse Empty = new MigrateSqlServerSqlMITaskOutputLoginLevelResponse();

    /**
     * Login migration end time
     * 
     */
    @Import(name="endedOn", required=true)
    private String endedOn;

    public String endedOn() {
        return this.endedOn;
    }

    /**
     * Login migration errors and warnings per login
     * 
     */
    @Import(name="exceptionsAndWarnings", required=true)
    private List<ReportableExceptionResponse> exceptionsAndWarnings;

    public List<ReportableExceptionResponse> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Login name.
     * 
     */
    @Import(name="loginName", required=true)
    private String loginName;

    public String loginName() {
        return this.loginName;
    }

    /**
     * Login migration progress message
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    /**
     * Result type
     * Expected value is &#39;LoginLevelOutput&#39;.
     * 
     */
    @Import(name="resultType", required=true)
    private String resultType;

    public String resultType() {
        return this.resultType;
    }

    /**
     * Current stage of login
     * 
     */
    @Import(name="stage", required=true)
    private String stage;

    public String stage() {
        return this.stage;
    }

    /**
     * Login migration start time
     * 
     */
    @Import(name="startedOn", required=true)
    private String startedOn;

    public String startedOn() {
        return this.startedOn;
    }

    /**
     * Current state of login
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private MigrateSqlServerSqlMITaskOutputLoginLevelResponse() {}

    private MigrateSqlServerSqlMITaskOutputLoginLevelResponse(MigrateSqlServerSqlMITaskOutputLoginLevelResponse $) {
        this.endedOn = $.endedOn;
        this.exceptionsAndWarnings = $.exceptionsAndWarnings;
        this.id = $.id;
        this.loginName = $.loginName;
        this.message = $.message;
        this.resultType = $.resultType;
        this.stage = $.stage;
        this.startedOn = $.startedOn;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateSqlServerSqlMITaskOutputLoginLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateSqlServerSqlMITaskOutputLoginLevelResponse $;

        public Builder() {
            $ = new MigrateSqlServerSqlMITaskOutputLoginLevelResponse();
        }

        public Builder(MigrateSqlServerSqlMITaskOutputLoginLevelResponse defaults) {
            $ = new MigrateSqlServerSqlMITaskOutputLoginLevelResponse(Objects.requireNonNull(defaults));
        }

        public Builder endedOn(String endedOn) {
            $.endedOn = endedOn;
            return this;
        }

        public Builder exceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            $.exceptionsAndWarnings = exceptionsAndWarnings;
            return this;
        }

        public Builder exceptionsAndWarnings(ReportableExceptionResponse... exceptionsAndWarnings) {
            return exceptionsAndWarnings(List.of(exceptionsAndWarnings));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder loginName(String loginName) {
            $.loginName = loginName;
            return this;
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public Builder resultType(String resultType) {
            $.resultType = resultType;
            return this;
        }

        public Builder stage(String stage) {
            $.stage = stage;
            return this;
        }

        public Builder startedOn(String startedOn) {
            $.startedOn = startedOn;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public MigrateSqlServerSqlMITaskOutputLoginLevelResponse build() {
            $.endedOn = Objects.requireNonNull($.endedOn, "expected parameter 'endedOn' to be non-null");
            $.exceptionsAndWarnings = Objects.requireNonNull($.exceptionsAndWarnings, "expected parameter 'exceptionsAndWarnings' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.loginName = Objects.requireNonNull($.loginName, "expected parameter 'loginName' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.resultType = Codegen.stringProp("resultType").arg($.resultType).require();
            $.stage = Objects.requireNonNull($.stage, "expected parameter 'stage' to be non-null");
            $.startedOn = Objects.requireNonNull($.startedOn, "expected parameter 'startedOn' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
