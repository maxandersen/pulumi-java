// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureMLWebServiceFileResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure ML Batch Execution activity.
 * 
 */
public final class AzureMLBatchExecutionActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureMLBatchExecutionActivityResponse Empty = new AzureMLBatchExecutionActivityResponse();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable List<ActivityDependencyResponse> dependsOn;

    public Optional<List<ActivityDependencyResponse>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     */
    @Import(name="globalParameters")
    private @Nullable Map<String,Object> globalParameters;

    public Optional<Map<String,Object>> globalParameters() {
        return Optional.ofNullable(this.globalParameters);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is &#39;AzureMLBatchExecution&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable List<UserPropertyResponse> userProperties;

    public Optional<List<UserPropertyResponse>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
     * 
     */
    @Import(name="webServiceInputs")
    private @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceInputs;

    public Optional<Map<String,AzureMLWebServiceFileResponse>> webServiceInputs() {
        return Optional.ofNullable(this.webServiceInputs);
    }

    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
     * 
     */
    @Import(name="webServiceOutputs")
    private @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceOutputs;

    public Optional<Map<String,AzureMLWebServiceFileResponse>> webServiceOutputs() {
        return Optional.ofNullable(this.webServiceOutputs);
    }

    private AzureMLBatchExecutionActivityResponse() {}

    private AzureMLBatchExecutionActivityResponse(AzureMLBatchExecutionActivityResponse $) {
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.globalParameters = $.globalParameters;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.type = $.type;
        this.userProperties = $.userProperties;
        this.webServiceInputs = $.webServiceInputs;
        this.webServiceOutputs = $.webServiceOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLBatchExecutionActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLBatchExecutionActivityResponse $;

        public Builder() {
            $ = new AzureMLBatchExecutionActivityResponse();
        }

        public Builder(AzureMLBatchExecutionActivityResponse defaults) {
            $ = new AzureMLBatchExecutionActivityResponse(Objects.requireNonNull(defaults));
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder globalParameters(@Nullable Map<String,Object> globalParameters) {
            $.globalParameters = globalParameters;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            $.policy = policy;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public Builder webServiceInputs(@Nullable Map<String,AzureMLWebServiceFileResponse> webServiceInputs) {
            $.webServiceInputs = webServiceInputs;
            return this;
        }

        public Builder webServiceOutputs(@Nullable Map<String,AzureMLWebServiceFileResponse> webServiceOutputs) {
            $.webServiceOutputs = webServiceOutputs;
            return this;
        }

        public AzureMLBatchExecutionActivityResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
