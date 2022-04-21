// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1OperationConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of operation configuration details associated with Apigee API proxies or remote services. Remote services are non-Apigee proxies, such as Istio-Envoy.
 * 
 */
public final class GoogleCloudApigeeV1OperationGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1OperationGroupArgs Empty = new GoogleCloudApigeeV1OperationGroupArgs();

    /**
     * Flag that specifes whether the configuration is for Apigee API proxy or a remote service. Valid values include `proxy` or `remoteservice`. Defaults to `proxy`. Set to `proxy` when Apigee API proxies are associated with the API product. Set to `remoteservice` when non-Apigee proxies like Istio-Envoy are associated with the API product.
     * 
     */
    @Import(name="operationConfigType")
    private @Nullable Output<String> operationConfigType;

    public Optional<Output<String>> operationConfigType() {
        return Optional.ofNullable(this.operationConfigType);
    }

    /**
     * List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     * 
     */
    @Import(name="operationConfigs", required=true)
    private Output<List<GoogleCloudApigeeV1OperationConfigArgs>> operationConfigs;

    public Output<List<GoogleCloudApigeeV1OperationConfigArgs>> operationConfigs() {
        return this.operationConfigs;
    }

    private GoogleCloudApigeeV1OperationGroupArgs() {}

    private GoogleCloudApigeeV1OperationGroupArgs(GoogleCloudApigeeV1OperationGroupArgs $) {
        this.operationConfigType = $.operationConfigType;
        this.operationConfigs = $.operationConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1OperationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1OperationGroupArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1OperationGroupArgs();
        }

        public Builder(GoogleCloudApigeeV1OperationGroupArgs defaults) {
            $ = new GoogleCloudApigeeV1OperationGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder operationConfigType(@Nullable Output<String> operationConfigType) {
            $.operationConfigType = operationConfigType;
            return this;
        }

        public Builder operationConfigType(String operationConfigType) {
            return operationConfigType(Output.of(operationConfigType));
        }

        public Builder operationConfigs(Output<List<GoogleCloudApigeeV1OperationConfigArgs>> operationConfigs) {
            $.operationConfigs = operationConfigs;
            return this;
        }

        public Builder operationConfigs(List<GoogleCloudApigeeV1OperationConfigArgs> operationConfigs) {
            return operationConfigs(Output.of(operationConfigs));
        }

        public Builder operationConfigs(GoogleCloudApigeeV1OperationConfigArgs... operationConfigs) {
            return operationConfigs(List.of(operationConfigs));
        }

        public GoogleCloudApigeeV1OperationGroupArgs build() {
            $.operationConfigs = Objects.requireNonNull($.operationConfigs, "expected parameter 'operationConfigs' to be non-null");
            return $;
        }
    }

}
