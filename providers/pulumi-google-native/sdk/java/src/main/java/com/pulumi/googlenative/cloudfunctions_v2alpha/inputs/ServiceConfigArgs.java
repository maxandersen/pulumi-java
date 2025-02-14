// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudfunctions_v2alpha.enums.ServiceConfigIngressSettings;
import com.pulumi.googlenative.cloudfunctions_v2alpha.enums.ServiceConfigVpcConnectorEgressSettings;
import com.pulumi.googlenative.cloudfunctions_v2alpha.inputs.SecretEnvVarArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the Service being deployed. Currently Supported : Cloud Run (fully managed).
 * 
 */
public final class ServiceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceConfigArgs Empty = new ServiceConfigArgs();

    /**
     * Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction, when set to true, the revision being deployed will serve 100% of traffic, ignoring any traffic split settings, if any. On GetFunction, true will be returned if the latest revision is serving 100% of traffic.
     * 
     */
    @Import(name="allTrafficOnLatestRevision")
    private @Nullable Output<Boolean> allTrafficOnLatestRevision;

    /**
     * @return Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction, when set to true, the revision being deployed will serve 100% of traffic, ignoring any traffic split settings, if any. On GetFunction, true will be returned if the latest revision is serving 100% of traffic.
     * 
     */
    public Optional<Output<Boolean>> allTrafficOnLatestRevision() {
        return Optional.ofNullable(this.allTrafficOnLatestRevision);
    }

    /**
     * The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is supplied the value is interpreted as bytes. See https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full description.
     * 
     */
    @Import(name="availableMemory")
    private @Nullable Output<String> availableMemory;

    /**
     * @return The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is supplied the value is interpreted as bytes. See https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full description.
     * 
     */
    public Optional<Output<String>> availableMemory() {
        return Optional.ofNullable(this.availableMemory);
    }

    /**
     * Environment variables that shall be available during function execution.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    /**
     * @return Environment variables that shall be available during function execution.
     * 
     */
    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The ingress settings for the function, controlling what traffic can reach it.
     * 
     */
    @Import(name="ingressSettings")
    private @Nullable Output<ServiceConfigIngressSettings> ingressSettings;

    /**
     * @return The ingress settings for the function, controlling what traffic can reach it.
     * 
     */
    public Optional<Output<ServiceConfigIngressSettings>> ingressSettings() {
        return Optional.ofNullable(this.ingressSettings);
    }

    /**
     * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
     * 
     */
    @Import(name="maxInstanceCount")
    private @Nullable Output<Integer> maxInstanceCount;

    /**
     * @return The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
     * 
     */
    public Optional<Output<Integer>> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }

    /**
     * The limit on the minimum number of function instances that may coexist at a given time. Function instances are kept in idle state for a short period after they finished executing the request to reduce cold start time for subsequent requests. Setting a minimum instance count will ensure that the given number of instances are kept running in idle state always. This can help with cold start times when jump in incoming request count occurs after the idle instance would have been stopped in the default case.
     * 
     */
    @Import(name="minInstanceCount")
    private @Nullable Output<Integer> minInstanceCount;

    /**
     * @return The limit on the minimum number of function instances that may coexist at a given time. Function instances are kept in idle state for a short period after they finished executing the request to reduce cold start time for subsequent requests. Setting a minimum instance count will ensure that the given number of instances are kept running in idle state always. This can help with cold start times when jump in incoming request count occurs after the idle instance would have been stopped in the default case.
     * 
     */
    public Optional<Output<Integer>> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    /**
     * Secret environment variables configuration.
     * 
     */
    @Import(name="secretEnvironmentVariables")
    private @Nullable Output<List<SecretEnvVarArgs>> secretEnvironmentVariables;

    /**
     * @return Secret environment variables configuration.
     * 
     */
    public Optional<Output<List<SecretEnvVarArgs>>> secretEnvironmentVariables() {
        return Optional.ofNullable(this.secretEnvironmentVariables);
    }

    /**
     * The email of the service&#39;s service account. If empty, defaults to `{project_number}-compute@developer.gserviceaccount.com`.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    /**
     * @return The email of the service&#39;s service account. If empty, defaults to `{project_number}-compute@developer.gserviceaccount.com`.
     * 
     */
    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    /**
     * The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    /**
     * The Serverless VPC Access connector that this cloud function can connect to. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    @Import(name="vpcConnector")
    private @Nullable Output<String> vpcConnector;

    /**
     * @return The Serverless VPC Access connector that this cloud function can connect to. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    public Optional<Output<String>> vpcConnector() {
        return Optional.ofNullable(this.vpcConnector);
    }

    /**
     * The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    @Import(name="vpcConnectorEgressSettings")
    private @Nullable Output<ServiceConfigVpcConnectorEgressSettings> vpcConnectorEgressSettings;

    /**
     * @return The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    public Optional<Output<ServiceConfigVpcConnectorEgressSettings>> vpcConnectorEgressSettings() {
        return Optional.ofNullable(this.vpcConnectorEgressSettings);
    }

    private ServiceConfigArgs() {}

    private ServiceConfigArgs(ServiceConfigArgs $) {
        this.allTrafficOnLatestRevision = $.allTrafficOnLatestRevision;
        this.availableMemory = $.availableMemory;
        this.environmentVariables = $.environmentVariables;
        this.ingressSettings = $.ingressSettings;
        this.maxInstanceCount = $.maxInstanceCount;
        this.minInstanceCount = $.minInstanceCount;
        this.secretEnvironmentVariables = $.secretEnvironmentVariables;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.timeoutSeconds = $.timeoutSeconds;
        this.vpcConnector = $.vpcConnector;
        this.vpcConnectorEgressSettings = $.vpcConnectorEgressSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceConfigArgs $;

        public Builder() {
            $ = new ServiceConfigArgs();
        }

        public Builder(ServiceConfigArgs defaults) {
            $ = new ServiceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allTrafficOnLatestRevision Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction, when set to true, the revision being deployed will serve 100% of traffic, ignoring any traffic split settings, if any. On GetFunction, true will be returned if the latest revision is serving 100% of traffic.
         * 
         * @return builder
         * 
         */
        public Builder allTrafficOnLatestRevision(@Nullable Output<Boolean> allTrafficOnLatestRevision) {
            $.allTrafficOnLatestRevision = allTrafficOnLatestRevision;
            return this;
        }

        /**
         * @param allTrafficOnLatestRevision Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction, when set to true, the revision being deployed will serve 100% of traffic, ignoring any traffic split settings, if any. On GetFunction, true will be returned if the latest revision is serving 100% of traffic.
         * 
         * @return builder
         * 
         */
        public Builder allTrafficOnLatestRevision(Boolean allTrafficOnLatestRevision) {
            return allTrafficOnLatestRevision(Output.of(allTrafficOnLatestRevision));
        }

        /**
         * @param availableMemory The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is supplied the value is interpreted as bytes. See https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full description.
         * 
         * @return builder
         * 
         */
        public Builder availableMemory(@Nullable Output<String> availableMemory) {
            $.availableMemory = availableMemory;
            return this;
        }

        /**
         * @param availableMemory The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is supplied the value is interpreted as bytes. See https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full description.
         * 
         * @return builder
         * 
         */
        public Builder availableMemory(String availableMemory) {
            return availableMemory(Output.of(availableMemory));
        }

        /**
         * @param environmentVariables Environment variables that shall be available during function execution.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables Environment variables that shall be available during function execution.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param ingressSettings The ingress settings for the function, controlling what traffic can reach it.
         * 
         * @return builder
         * 
         */
        public Builder ingressSettings(@Nullable Output<ServiceConfigIngressSettings> ingressSettings) {
            $.ingressSettings = ingressSettings;
            return this;
        }

        /**
         * @param ingressSettings The ingress settings for the function, controlling what traffic can reach it.
         * 
         * @return builder
         * 
         */
        public Builder ingressSettings(ServiceConfigIngressSettings ingressSettings) {
            return ingressSettings(Output.of(ingressSettings));
        }

        /**
         * @param maxInstanceCount The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(@Nullable Output<Integer> maxInstanceCount) {
            $.maxInstanceCount = maxInstanceCount;
            return this;
        }

        /**
         * @param maxInstanceCount The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(Integer maxInstanceCount) {
            return maxInstanceCount(Output.of(maxInstanceCount));
        }

        /**
         * @param minInstanceCount The limit on the minimum number of function instances that may coexist at a given time. Function instances are kept in idle state for a short period after they finished executing the request to reduce cold start time for subsequent requests. Setting a minimum instance count will ensure that the given number of instances are kept running in idle state always. This can help with cold start times when jump in incoming request count occurs after the idle instance would have been stopped in the default case.
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(@Nullable Output<Integer> minInstanceCount) {
            $.minInstanceCount = minInstanceCount;
            return this;
        }

        /**
         * @param minInstanceCount The limit on the minimum number of function instances that may coexist at a given time. Function instances are kept in idle state for a short period after they finished executing the request to reduce cold start time for subsequent requests. Setting a minimum instance count will ensure that the given number of instances are kept running in idle state always. This can help with cold start times when jump in incoming request count occurs after the idle instance would have been stopped in the default case.
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(Integer minInstanceCount) {
            return minInstanceCount(Output.of(minInstanceCount));
        }

        /**
         * @param secretEnvironmentVariables Secret environment variables configuration.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvironmentVariables(@Nullable Output<List<SecretEnvVarArgs>> secretEnvironmentVariables) {
            $.secretEnvironmentVariables = secretEnvironmentVariables;
            return this;
        }

        /**
         * @param secretEnvironmentVariables Secret environment variables configuration.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvironmentVariables(List<SecretEnvVarArgs> secretEnvironmentVariables) {
            return secretEnvironmentVariables(Output.of(secretEnvironmentVariables));
        }

        /**
         * @param secretEnvironmentVariables Secret environment variables configuration.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvironmentVariables(SecretEnvVarArgs... secretEnvironmentVariables) {
            return secretEnvironmentVariables(List.of(secretEnvironmentVariables));
        }

        /**
         * @param serviceAccountEmail The email of the service&#39;s service account. If empty, defaults to `{project_number}-compute@developer.gserviceaccount.com`.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail The email of the service&#39;s service account. If empty, defaults to `{project_number}-compute@developer.gserviceaccount.com`.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param timeoutSeconds The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        /**
         * @param vpcConnector The Serverless VPC Access connector that this cloud function can connect to. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnector(@Nullable Output<String> vpcConnector) {
            $.vpcConnector = vpcConnector;
            return this;
        }

        /**
         * @param vpcConnector The Serverless VPC Access connector that this cloud function can connect to. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnector(String vpcConnector) {
            return vpcConnector(Output.of(vpcConnector));
        }

        /**
         * @param vpcConnectorEgressSettings The egress settings for the connector, controlling what traffic is diverted through it.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectorEgressSettings(@Nullable Output<ServiceConfigVpcConnectorEgressSettings> vpcConnectorEgressSettings) {
            $.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }

        /**
         * @param vpcConnectorEgressSettings The egress settings for the connector, controlling what traffic is diverted through it.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectorEgressSettings(ServiceConfigVpcConnectorEgressSettings vpcConnectorEgressSettings) {
            return vpcConnectorEgressSettings(Output.of(vpcConnectorEgressSettings));
        }

        public ServiceConfigArgs build() {
            return $;
        }
    }

}
