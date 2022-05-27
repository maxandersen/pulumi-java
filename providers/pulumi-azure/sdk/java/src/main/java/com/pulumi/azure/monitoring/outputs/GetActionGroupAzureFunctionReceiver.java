// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActionGroupAzureFunctionReceiver {
    /**
     * @return The Azure resource ID of the function app.
     * 
     */
    private final String functionAppResourceId;
    /**
     * @return The function name in the function app.
     * 
     */
    private final String functionName;
    /**
     * @return The HTTP trigger url where HTTP request sent to.
     * 
     */
    private final String httpTriggerUrl;
    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    private final String name;
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    private final Boolean useCommonAlertSchema;

    @CustomType.Constructor
    private GetActionGroupAzureFunctionReceiver(
        @CustomType.Parameter("functionAppResourceId") String functionAppResourceId,
        @CustomType.Parameter("functionName") String functionName,
        @CustomType.Parameter("httpTriggerUrl") String httpTriggerUrl,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("useCommonAlertSchema") Boolean useCommonAlertSchema) {
        this.functionAppResourceId = functionAppResourceId;
        this.functionName = functionName;
        this.httpTriggerUrl = httpTriggerUrl;
        this.name = name;
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * @return The Azure resource ID of the function app.
     * 
     */
    public String functionAppResourceId() {
        return this.functionAppResourceId;
    }
    /**
     * @return The function name in the function app.
     * 
     */
    public String functionName() {
        return this.functionName;
    }
    /**
     * @return The HTTP trigger url where HTTP request sent to.
     * 
     */
    public String httpTriggerUrl() {
        return this.httpTriggerUrl;
    }
    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionGroupAzureFunctionReceiver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionAppResourceId;
        private String functionName;
        private String httpTriggerUrl;
        private String name;
        private Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActionGroupAzureFunctionReceiver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.functionName = defaults.functionName;
    	      this.httpTriggerUrl = defaults.httpTriggerUrl;
    	      this.name = defaults.name;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder functionAppResourceId(String functionAppResourceId) {
            this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId);
            return this;
        }
        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        public Builder httpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder useCommonAlertSchema(Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = Objects.requireNonNull(useCommonAlertSchema);
            return this;
        }        public GetActionGroupAzureFunctionReceiver build() {
            return new GetActionGroupAzureFunctionReceiver(functionAppResourceId, functionName, httpTriggerUrl, name, useCommonAlertSchema);
        }
    }
}
