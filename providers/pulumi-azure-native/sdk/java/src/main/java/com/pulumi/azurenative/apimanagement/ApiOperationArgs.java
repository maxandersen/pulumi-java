// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.inputs.ParameterContractArgs;
import com.pulumi.azurenative.apimanagement.inputs.RequestContractArgs;
import com.pulumi.azurenative.apimanagement.inputs.ResponseContractArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOperationArgs Empty = new ApiOperationArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Description of the operation. May include HTML formatting tags.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Operation Name.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them.
     * 
     */
    @Import(name="method", required=true)
    private Output<String> method;

    public Output<String> method() {
        return this.method;
    }

    /**
     * Operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="operationId")
    private @Nullable Output<String> operationId;

    public Optional<Output<String>> operationId() {
        return Optional.ofNullable(this.operationId);
    }

    /**
     * Operation Policies
     * 
     */
    @Import(name="policies")
    private @Nullable Output<String> policies;

    public Optional<Output<String>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * An entity containing request details.
     * 
     */
    @Import(name="request")
    private @Nullable Output<RequestContractArgs> request;

    public Optional<Output<RequestContractArgs>> request() {
        return Optional.ofNullable(this.request);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Array of Operation responses.
     * 
     */
    @Import(name="responses")
    private @Nullable Output<List<ResponseContractArgs>> responses;

    public Optional<Output<List<ResponseContractArgs>>> responses() {
        return Optional.ofNullable(this.responses);
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Collection of URL template parameters.
     * 
     */
    @Import(name="templateParameters")
    private @Nullable Output<List<ParameterContractArgs>> templateParameters;

    public Optional<Output<List<ParameterContractArgs>>> templateParameters() {
        return Optional.ofNullable(this.templateParameters);
    }

    /**
     * Relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}
     * 
     */
    @Import(name="urlTemplate", required=true)
    private Output<String> urlTemplate;

    public Output<String> urlTemplate() {
        return this.urlTemplate;
    }

    private ApiOperationArgs() {}

    private ApiOperationArgs(ApiOperationArgs $) {
        this.apiId = $.apiId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.method = $.method;
        this.operationId = $.operationId;
        this.policies = $.policies;
        this.request = $.request;
        this.resourceGroupName = $.resourceGroupName;
        this.responses = $.responses;
        this.serviceName = $.serviceName;
        this.templateParameters = $.templateParameters;
        this.urlTemplate = $.urlTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOperationArgs $;

        public Builder() {
            $ = new ApiOperationArgs();
        }

        public Builder(ApiOperationArgs defaults) {
            $ = new ApiOperationArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder method(Output<String> method) {
            $.method = method;
            return this;
        }

        public Builder method(String method) {
            return method(Output.of(method));
        }

        public Builder operationId(@Nullable Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        public Builder policies(@Nullable Output<String> policies) {
            $.policies = policies;
            return this;
        }

        public Builder policies(String policies) {
            return policies(Output.of(policies));
        }

        public Builder request(@Nullable Output<RequestContractArgs> request) {
            $.request = request;
            return this;
        }

        public Builder request(RequestContractArgs request) {
            return request(Output.of(request));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder responses(@Nullable Output<List<ResponseContractArgs>> responses) {
            $.responses = responses;
            return this;
        }

        public Builder responses(List<ResponseContractArgs> responses) {
            return responses(Output.of(responses));
        }

        public Builder responses(ResponseContractArgs... responses) {
            return responses(List.of(responses));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder templateParameters(@Nullable Output<List<ParameterContractArgs>> templateParameters) {
            $.templateParameters = templateParameters;
            return this;
        }

        public Builder templateParameters(List<ParameterContractArgs> templateParameters) {
            return templateParameters(Output.of(templateParameters));
        }

        public Builder templateParameters(ParameterContractArgs... templateParameters) {
            return templateParameters(List.of(templateParameters));
        }

        public Builder urlTemplate(Output<String> urlTemplate) {
            $.urlTemplate = urlTemplate;
            return this;
        }

        public Builder urlTemplate(String urlTemplate) {
            return urlTemplate(Output.of(urlTemplate));
        }

        public ApiOperationArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.method = Objects.requireNonNull($.method, "expected parameter 'method' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.urlTemplate = Objects.requireNonNull($.urlTemplate, "expected parameter 'urlTemplate' to be non-null");
            return $;
        }
    }

}
