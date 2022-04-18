// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.appengine_v1.enums.VersionInboundServicesItem;
import com.pulumi.googlenative.appengine_v1.enums.VersionServingStatus;
import com.pulumi.googlenative.appengine_v1.inputs.ApiConfigHandlerArgs;
import com.pulumi.googlenative.appengine_v1.inputs.AutomaticScalingArgs;
import com.pulumi.googlenative.appengine_v1.inputs.BasicScalingArgs;
import com.pulumi.googlenative.appengine_v1.inputs.DeploymentArgs;
import com.pulumi.googlenative.appengine_v1.inputs.EndpointsApiServiceArgs;
import com.pulumi.googlenative.appengine_v1.inputs.EntrypointArgs;
import com.pulumi.googlenative.appengine_v1.inputs.ErrorHandlerArgs;
import com.pulumi.googlenative.appengine_v1.inputs.HealthCheckArgs;
import com.pulumi.googlenative.appengine_v1.inputs.LibraryArgs;
import com.pulumi.googlenative.appengine_v1.inputs.LivenessCheckArgs;
import com.pulumi.googlenative.appengine_v1.inputs.ManualScalingArgs;
import com.pulumi.googlenative.appengine_v1.inputs.NetworkArgs;
import com.pulumi.googlenative.appengine_v1.inputs.ReadinessCheckArgs;
import com.pulumi.googlenative.appengine_v1.inputs.ResourcesArgs;
import com.pulumi.googlenative.appengine_v1.inputs.UrlMapArgs;
import com.pulumi.googlenative.appengine_v1.inputs.VpcAccessConnectorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    /**
     * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="apiConfig")
      private final @Nullable Output<ApiConfigHandlerArgs> apiConfig;

    public Output<ApiConfigHandlerArgs> apiConfig() {
        return this.apiConfig == null ? Codegen.empty() : this.apiConfig;
    }

    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
     * 
     */
    @Import(name="automaticScaling")
      private final @Nullable Output<AutomaticScalingArgs> automaticScaling;

    public Output<AutomaticScalingArgs> automaticScaling() {
        return this.automaticScaling == null ? Codegen.empty() : this.automaticScaling;
    }

    /**
     * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * 
     */
    @Import(name="basicScaling")
      private final @Nullable Output<BasicScalingArgs> basicScaling;

    public Output<BasicScalingArgs> basicScaling() {
        return this.basicScaling == null ? Codegen.empty() : this.basicScaling;
    }

    /**
     * Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    @Import(name="betaSettings")
      private final @Nullable Output<Map<String,String>> betaSettings;

    public Output<Map<String,String>> betaSettings() {
        return this.betaSettings == null ? Codegen.empty() : this.betaSettings;
    }

    /**
     * Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="buildEnvVariables")
      private final @Nullable Output<Map<String,String>> buildEnvVariables;

    public Output<Map<String,String>> buildEnvVariables() {
        return this.buildEnvVariables == null ? Codegen.empty() : this.buildEnvVariables;
    }

    /**
     * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="defaultExpiration")
      private final @Nullable Output<String> defaultExpiration;

    public Output<String> defaultExpiration() {
        return this.defaultExpiration == null ? Codegen.empty() : this.defaultExpiration;
    }

    /**
     * Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="deployment")
      private final @Nullable Output<DeploymentArgs> deployment;

    public Output<DeploymentArgs> deployment() {
        return this.deployment == null ? Codegen.empty() : this.deployment;
    }

    /**
     * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
     * 
     */
    @Import(name="endpointsApiService")
      private final @Nullable Output<EndpointsApiServiceArgs> endpointsApiService;

    public Output<EndpointsApiServiceArgs> endpointsApiService() {
        return this.endpointsApiService == null ? Codegen.empty() : this.endpointsApiService;
    }

    /**
     * The entrypoint for the application.
     * 
     */
    @Import(name="entrypoint")
      private final @Nullable Output<EntrypointArgs> entrypoint;

    public Output<EntrypointArgs> entrypoint() {
        return this.entrypoint == null ? Codegen.empty() : this.entrypoint;
    }

    /**
     * App Engine execution environment for this version.Defaults to standard.
     * 
     */
    @Import(name="env")
      private final @Nullable Output<String> env;

    public Output<String> env() {
        return this.env == null ? Codegen.empty() : this.env;
    }

    /**
     * Environment variables available to the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="envVariables")
      private final @Nullable Output<Map<String,String>> envVariables;

    public Output<Map<String,String>> envVariables() {
        return this.envVariables == null ? Codegen.empty() : this.envVariables;
    }

    /**
     * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="errorHandlers")
      private final @Nullable Output<List<ErrorHandlerArgs>> errorHandlers;

    public Output<List<ErrorHandlerArgs>> errorHandlers() {
        return this.errorHandlers == null ? Codegen.empty() : this.errorHandlers;
    }

    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="handlers")
      private final @Nullable Output<List<UrlMapArgs>> handlers;

    public Output<List<UrlMapArgs>> handlers() {
        return this.handlers == null ? Codegen.empty() : this.handlers;
    }

    /**
     * Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<HealthCheckArgs> healthCheck;

    public Output<HealthCheckArgs> healthCheck() {
        return this.healthCheck == null ? Codegen.empty() : this.healthCheck;
    }

    /**
     * Relative name of the version within the service. Example: v1. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names: "default", "latest", and any name with the prefix "ah-".
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Before an application can receive email or XMPP messages, the application must be configured to enable the service.
     * 
     */
    @Import(name="inboundServices")
      private final @Nullable Output<List<VersionInboundServicesItem>> inboundServices;

    public Output<List<VersionInboundServicesItem>> inboundServices() {
        return this.inboundServices == null ? Codegen.empty() : this.inboundServices;
    }

    /**
     * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
     * 
     */
    @Import(name="instanceClass")
      private final @Nullable Output<String> instanceClass;

    public Output<String> instanceClass() {
        return this.instanceClass == null ? Codegen.empty() : this.instanceClass;
    }

    /**
     * Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="libraries")
      private final @Nullable Output<List<LibraryArgs>> libraries;

    public Output<List<LibraryArgs>> libraries() {
        return this.libraries == null ? Codegen.empty() : this.libraries;
    }

    /**
     * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="livenessCheck")
      private final @Nullable Output<LivenessCheckArgs> livenessCheck;

    public Output<LivenessCheckArgs> livenessCheck() {
        return this.livenessCheck == null ? Codegen.empty() : this.livenessCheck;
    }

    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as "backends".
     * 
     */
    @Import(name="manualScaling")
      private final @Nullable Output<ManualScalingArgs> manualScaling;

    public Output<ManualScalingArgs> manualScaling() {
        return this.manualScaling == null ? Codegen.empty() : this.manualScaling;
    }

    /**
     * Extra network settings. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<NetworkArgs> network;

    public Output<NetworkArgs> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="nobuildFilesRegex")
      private final @Nullable Output<String> nobuildFilesRegex;

    public Output<String> nobuildFilesRegex() {
        return this.nobuildFilesRegex == null ? Codegen.empty() : this.nobuildFilesRegex;
    }

    /**
     * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Import(name="readinessCheck")
      private final @Nullable Output<ReadinessCheckArgs> readinessCheck;

    public Output<ReadinessCheckArgs> readinessCheck() {
        return this.readinessCheck == null ? Codegen.empty() : this.readinessCheck;
    }

    /**
     * Machine resources for this version. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<ResourcesArgs> resources;

    public Output<ResourcesArgs> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    /**
     * Desired runtime. Example: python27.
     * 
     */
    @Import(name="runtime")
      private final @Nullable Output<String> runtime;

    public Output<String> runtime() {
        return this.runtime == null ? Codegen.empty() : this.runtime;
    }

    /**
     * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
     * 
     */
    @Import(name="runtimeApiVersion")
      private final @Nullable Output<String> runtimeApiVersion;

    public Output<String> runtimeApiVersion() {
        return this.runtimeApiVersion == null ? Codegen.empty() : this.runtimeApiVersion;
    }

    /**
     * The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
     * 
     */
    @Import(name="runtimeChannel")
      private final @Nullable Output<String> runtimeChannel;

    public Output<String> runtimeChannel() {
        return this.runtimeChannel == null ? Codegen.empty() : this.runtimeChannel;
    }

    /**
     * The path or name of the app's main executable.
     * 
     */
    @Import(name="runtimeMainExecutablePath")
      private final @Nullable Output<String> runtimeMainExecutablePath;

    public Output<String> runtimeMainExecutablePath() {
        return this.runtimeMainExecutablePath == null ? Codegen.empty() : this.runtimeMainExecutablePath;
    }

    /**
     * The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    @Import(name="serviceId", required=true)
      private final Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
     * 
     */
    @Import(name="servingStatus")
      private final @Nullable Output<VersionServingStatus> servingStatus;

    public Output<VersionServingStatus> servingStatus() {
        return this.servingStatus == null ? Codegen.empty() : this.servingStatus;
    }

    /**
     * Whether multiple requests can be dispatched to this version at once.
     * 
     */
    @Import(name="threadsafe")
      private final @Nullable Output<Boolean> threadsafe;

    public Output<Boolean> threadsafe() {
        return this.threadsafe == null ? Codegen.empty() : this.threadsafe;
    }

    /**
     * Whether to deploy this version in a container on a virtual machine.
     * 
     */
    @Import(name="vm")
      private final @Nullable Output<Boolean> vm;

    public Output<Boolean> vm() {
        return this.vm == null ? Codegen.empty() : this.vm;
    }

    /**
     * Enables VPC connectivity for standard apps.
     * 
     */
    @Import(name="vpcAccessConnector")
      private final @Nullable Output<VpcAccessConnectorArgs> vpcAccessConnector;

    public Output<VpcAccessConnectorArgs> vpcAccessConnector() {
        return this.vpcAccessConnector == null ? Codegen.empty() : this.vpcAccessConnector;
    }

    public VersionArgs(
        @Nullable Output<ApiConfigHandlerArgs> apiConfig,
        Output<String> appId,
        @Nullable Output<AutomaticScalingArgs> automaticScaling,
        @Nullable Output<BasicScalingArgs> basicScaling,
        @Nullable Output<Map<String,String>> betaSettings,
        @Nullable Output<Map<String,String>> buildEnvVariables,
        @Nullable Output<String> defaultExpiration,
        @Nullable Output<DeploymentArgs> deployment,
        @Nullable Output<EndpointsApiServiceArgs> endpointsApiService,
        @Nullable Output<EntrypointArgs> entrypoint,
        @Nullable Output<String> env,
        @Nullable Output<Map<String,String>> envVariables,
        @Nullable Output<List<ErrorHandlerArgs>> errorHandlers,
        @Nullable Output<List<UrlMapArgs>> handlers,
        @Nullable Output<HealthCheckArgs> healthCheck,
        @Nullable Output<String> id,
        @Nullable Output<List<VersionInboundServicesItem>> inboundServices,
        @Nullable Output<String> instanceClass,
        @Nullable Output<List<LibraryArgs>> libraries,
        @Nullable Output<LivenessCheckArgs> livenessCheck,
        @Nullable Output<ManualScalingArgs> manualScaling,
        @Nullable Output<NetworkArgs> network,
        @Nullable Output<String> nobuildFilesRegex,
        @Nullable Output<ReadinessCheckArgs> readinessCheck,
        @Nullable Output<ResourcesArgs> resources,
        @Nullable Output<String> runtime,
        @Nullable Output<String> runtimeApiVersion,
        @Nullable Output<String> runtimeChannel,
        @Nullable Output<String> runtimeMainExecutablePath,
        @Nullable Output<String> serviceAccount,
        Output<String> serviceId,
        @Nullable Output<VersionServingStatus> servingStatus,
        @Nullable Output<Boolean> threadsafe,
        @Nullable Output<Boolean> vm,
        @Nullable Output<VpcAccessConnectorArgs> vpcAccessConnector) {
        this.apiConfig = apiConfig;
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.automaticScaling = automaticScaling;
        this.basicScaling = basicScaling;
        this.betaSettings = betaSettings;
        this.buildEnvVariables = buildEnvVariables;
        this.defaultExpiration = defaultExpiration;
        this.deployment = deployment;
        this.endpointsApiService = endpointsApiService;
        this.entrypoint = entrypoint;
        this.env = env;
        this.envVariables = envVariables;
        this.errorHandlers = errorHandlers;
        this.handlers = handlers;
        this.healthCheck = healthCheck;
        this.id = id;
        this.inboundServices = inboundServices;
        this.instanceClass = instanceClass;
        this.libraries = libraries;
        this.livenessCheck = livenessCheck;
        this.manualScaling = manualScaling;
        this.network = network;
        this.nobuildFilesRegex = nobuildFilesRegex;
        this.readinessCheck = readinessCheck;
        this.resources = resources;
        this.runtime = runtime;
        this.runtimeApiVersion = runtimeApiVersion;
        this.runtimeChannel = runtimeChannel;
        this.runtimeMainExecutablePath = runtimeMainExecutablePath;
        this.serviceAccount = serviceAccount;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.servingStatus = servingStatus;
        this.threadsafe = threadsafe;
        this.vm = vm;
        this.vpcAccessConnector = vpcAccessConnector;
    }

    private VersionArgs() {
        this.apiConfig = Codegen.empty();
        this.appId = Codegen.empty();
        this.automaticScaling = Codegen.empty();
        this.basicScaling = Codegen.empty();
        this.betaSettings = Codegen.empty();
        this.buildEnvVariables = Codegen.empty();
        this.defaultExpiration = Codegen.empty();
        this.deployment = Codegen.empty();
        this.endpointsApiService = Codegen.empty();
        this.entrypoint = Codegen.empty();
        this.env = Codegen.empty();
        this.envVariables = Codegen.empty();
        this.errorHandlers = Codegen.empty();
        this.handlers = Codegen.empty();
        this.healthCheck = Codegen.empty();
        this.id = Codegen.empty();
        this.inboundServices = Codegen.empty();
        this.instanceClass = Codegen.empty();
        this.libraries = Codegen.empty();
        this.livenessCheck = Codegen.empty();
        this.manualScaling = Codegen.empty();
        this.network = Codegen.empty();
        this.nobuildFilesRegex = Codegen.empty();
        this.readinessCheck = Codegen.empty();
        this.resources = Codegen.empty();
        this.runtime = Codegen.empty();
        this.runtimeApiVersion = Codegen.empty();
        this.runtimeChannel = Codegen.empty();
        this.runtimeMainExecutablePath = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.serviceId = Codegen.empty();
        this.servingStatus = Codegen.empty();
        this.threadsafe = Codegen.empty();
        this.vm = Codegen.empty();
        this.vpcAccessConnector = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApiConfigHandlerArgs> apiConfig;
        private Output<String> appId;
        private @Nullable Output<AutomaticScalingArgs> automaticScaling;
        private @Nullable Output<BasicScalingArgs> basicScaling;
        private @Nullable Output<Map<String,String>> betaSettings;
        private @Nullable Output<Map<String,String>> buildEnvVariables;
        private @Nullable Output<String> defaultExpiration;
        private @Nullable Output<DeploymentArgs> deployment;
        private @Nullable Output<EndpointsApiServiceArgs> endpointsApiService;
        private @Nullable Output<EntrypointArgs> entrypoint;
        private @Nullable Output<String> env;
        private @Nullable Output<Map<String,String>> envVariables;
        private @Nullable Output<List<ErrorHandlerArgs>> errorHandlers;
        private @Nullable Output<List<UrlMapArgs>> handlers;
        private @Nullable Output<HealthCheckArgs> healthCheck;
        private @Nullable Output<String> id;
        private @Nullable Output<List<VersionInboundServicesItem>> inboundServices;
        private @Nullable Output<String> instanceClass;
        private @Nullable Output<List<LibraryArgs>> libraries;
        private @Nullable Output<LivenessCheckArgs> livenessCheck;
        private @Nullable Output<ManualScalingArgs> manualScaling;
        private @Nullable Output<NetworkArgs> network;
        private @Nullable Output<String> nobuildFilesRegex;
        private @Nullable Output<ReadinessCheckArgs> readinessCheck;
        private @Nullable Output<ResourcesArgs> resources;
        private @Nullable Output<String> runtime;
        private @Nullable Output<String> runtimeApiVersion;
        private @Nullable Output<String> runtimeChannel;
        private @Nullable Output<String> runtimeMainExecutablePath;
        private @Nullable Output<String> serviceAccount;
        private Output<String> serviceId;
        private @Nullable Output<VersionServingStatus> servingStatus;
        private @Nullable Output<Boolean> threadsafe;
        private @Nullable Output<Boolean> vm;
        private @Nullable Output<VpcAccessConnectorArgs> vpcAccessConnector;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.appId = defaults.appId;
    	      this.automaticScaling = defaults.automaticScaling;
    	      this.basicScaling = defaults.basicScaling;
    	      this.betaSettings = defaults.betaSettings;
    	      this.buildEnvVariables = defaults.buildEnvVariables;
    	      this.defaultExpiration = defaults.defaultExpiration;
    	      this.deployment = defaults.deployment;
    	      this.endpointsApiService = defaults.endpointsApiService;
    	      this.entrypoint = defaults.entrypoint;
    	      this.env = defaults.env;
    	      this.envVariables = defaults.envVariables;
    	      this.errorHandlers = defaults.errorHandlers;
    	      this.handlers = defaults.handlers;
    	      this.healthCheck = defaults.healthCheck;
    	      this.id = defaults.id;
    	      this.inboundServices = defaults.inboundServices;
    	      this.instanceClass = defaults.instanceClass;
    	      this.libraries = defaults.libraries;
    	      this.livenessCheck = defaults.livenessCheck;
    	      this.manualScaling = defaults.manualScaling;
    	      this.network = defaults.network;
    	      this.nobuildFilesRegex = defaults.nobuildFilesRegex;
    	      this.readinessCheck = defaults.readinessCheck;
    	      this.resources = defaults.resources;
    	      this.runtime = defaults.runtime;
    	      this.runtimeApiVersion = defaults.runtimeApiVersion;
    	      this.runtimeChannel = defaults.runtimeChannel;
    	      this.runtimeMainExecutablePath = defaults.runtimeMainExecutablePath;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceId = defaults.serviceId;
    	      this.servingStatus = defaults.servingStatus;
    	      this.threadsafe = defaults.threadsafe;
    	      this.vm = defaults.vm;
    	      this.vpcAccessConnector = defaults.vpcAccessConnector;
        }

        public Builder apiConfig(@Nullable Output<ApiConfigHandlerArgs> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }
        public Builder apiConfig(@Nullable ApiConfigHandlerArgs apiConfig) {
            this.apiConfig = Codegen.ofNullable(apiConfig);
            return this;
        }
        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }
        public Builder automaticScaling(@Nullable Output<AutomaticScalingArgs> automaticScaling) {
            this.automaticScaling = automaticScaling;
            return this;
        }
        public Builder automaticScaling(@Nullable AutomaticScalingArgs automaticScaling) {
            this.automaticScaling = Codegen.ofNullable(automaticScaling);
            return this;
        }
        public Builder basicScaling(@Nullable Output<BasicScalingArgs> basicScaling) {
            this.basicScaling = basicScaling;
            return this;
        }
        public Builder basicScaling(@Nullable BasicScalingArgs basicScaling) {
            this.basicScaling = Codegen.ofNullable(basicScaling);
            return this;
        }
        public Builder betaSettings(@Nullable Output<Map<String,String>> betaSettings) {
            this.betaSettings = betaSettings;
            return this;
        }
        public Builder betaSettings(@Nullable Map<String,String> betaSettings) {
            this.betaSettings = Codegen.ofNullable(betaSettings);
            return this;
        }
        public Builder buildEnvVariables(@Nullable Output<Map<String,String>> buildEnvVariables) {
            this.buildEnvVariables = buildEnvVariables;
            return this;
        }
        public Builder buildEnvVariables(@Nullable Map<String,String> buildEnvVariables) {
            this.buildEnvVariables = Codegen.ofNullable(buildEnvVariables);
            return this;
        }
        public Builder defaultExpiration(@Nullable Output<String> defaultExpiration) {
            this.defaultExpiration = defaultExpiration;
            return this;
        }
        public Builder defaultExpiration(@Nullable String defaultExpiration) {
            this.defaultExpiration = Codegen.ofNullable(defaultExpiration);
            return this;
        }
        public Builder deployment(@Nullable Output<DeploymentArgs> deployment) {
            this.deployment = deployment;
            return this;
        }
        public Builder deployment(@Nullable DeploymentArgs deployment) {
            this.deployment = Codegen.ofNullable(deployment);
            return this;
        }
        public Builder endpointsApiService(@Nullable Output<EndpointsApiServiceArgs> endpointsApiService) {
            this.endpointsApiService = endpointsApiService;
            return this;
        }
        public Builder endpointsApiService(@Nullable EndpointsApiServiceArgs endpointsApiService) {
            this.endpointsApiService = Codegen.ofNullable(endpointsApiService);
            return this;
        }
        public Builder entrypoint(@Nullable Output<EntrypointArgs> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public Builder entrypoint(@Nullable EntrypointArgs entrypoint) {
            this.entrypoint = Codegen.ofNullable(entrypoint);
            return this;
        }
        public Builder env(@Nullable Output<String> env) {
            this.env = env;
            return this;
        }
        public Builder env(@Nullable String env) {
            this.env = Codegen.ofNullable(env);
            return this;
        }
        public Builder envVariables(@Nullable Output<Map<String,String>> envVariables) {
            this.envVariables = envVariables;
            return this;
        }
        public Builder envVariables(@Nullable Map<String,String> envVariables) {
            this.envVariables = Codegen.ofNullable(envVariables);
            return this;
        }
        public Builder errorHandlers(@Nullable Output<List<ErrorHandlerArgs>> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public Builder errorHandlers(@Nullable List<ErrorHandlerArgs> errorHandlers) {
            this.errorHandlers = Codegen.ofNullable(errorHandlers);
            return this;
        }
        public Builder errorHandlers(ErrorHandlerArgs... errorHandlers) {
            return errorHandlers(List.of(errorHandlers));
        }
        public Builder handlers(@Nullable Output<List<UrlMapArgs>> handlers) {
            this.handlers = handlers;
            return this;
        }
        public Builder handlers(@Nullable List<UrlMapArgs> handlers) {
            this.handlers = Codegen.ofNullable(handlers);
            return this;
        }
        public Builder handlers(UrlMapArgs... handlers) {
            return handlers(List.of(handlers));
        }
        public Builder healthCheck(@Nullable Output<HealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Builder healthCheck(@Nullable HealthCheckArgs healthCheck) {
            this.healthCheck = Codegen.ofNullable(healthCheck);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder inboundServices(@Nullable Output<List<VersionInboundServicesItem>> inboundServices) {
            this.inboundServices = inboundServices;
            return this;
        }
        public Builder inboundServices(@Nullable List<VersionInboundServicesItem> inboundServices) {
            this.inboundServices = Codegen.ofNullable(inboundServices);
            return this;
        }
        public Builder inboundServices(VersionInboundServicesItem... inboundServices) {
            return inboundServices(List.of(inboundServices));
        }
        public Builder instanceClass(@Nullable Output<String> instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public Builder instanceClass(@Nullable String instanceClass) {
            this.instanceClass = Codegen.ofNullable(instanceClass);
            return this;
        }
        public Builder libraries(@Nullable Output<List<LibraryArgs>> libraries) {
            this.libraries = libraries;
            return this;
        }
        public Builder libraries(@Nullable List<LibraryArgs> libraries) {
            this.libraries = Codegen.ofNullable(libraries);
            return this;
        }
        public Builder libraries(LibraryArgs... libraries) {
            return libraries(List.of(libraries));
        }
        public Builder livenessCheck(@Nullable Output<LivenessCheckArgs> livenessCheck) {
            this.livenessCheck = livenessCheck;
            return this;
        }
        public Builder livenessCheck(@Nullable LivenessCheckArgs livenessCheck) {
            this.livenessCheck = Codegen.ofNullable(livenessCheck);
            return this;
        }
        public Builder manualScaling(@Nullable Output<ManualScalingArgs> manualScaling) {
            this.manualScaling = manualScaling;
            return this;
        }
        public Builder manualScaling(@Nullable ManualScalingArgs manualScaling) {
            this.manualScaling = Codegen.ofNullable(manualScaling);
            return this;
        }
        public Builder network(@Nullable Output<NetworkArgs> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable NetworkArgs network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder nobuildFilesRegex(@Nullable Output<String> nobuildFilesRegex) {
            this.nobuildFilesRegex = nobuildFilesRegex;
            return this;
        }
        public Builder nobuildFilesRegex(@Nullable String nobuildFilesRegex) {
            this.nobuildFilesRegex = Codegen.ofNullable(nobuildFilesRegex);
            return this;
        }
        public Builder readinessCheck(@Nullable Output<ReadinessCheckArgs> readinessCheck) {
            this.readinessCheck = readinessCheck;
            return this;
        }
        public Builder readinessCheck(@Nullable ReadinessCheckArgs readinessCheck) {
            this.readinessCheck = Codegen.ofNullable(readinessCheck);
            return this;
        }
        public Builder resources(@Nullable Output<ResourcesArgs> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable ResourcesArgs resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder runtime(@Nullable Output<String> runtime) {
            this.runtime = runtime;
            return this;
        }
        public Builder runtime(@Nullable String runtime) {
            this.runtime = Codegen.ofNullable(runtime);
            return this;
        }
        public Builder runtimeApiVersion(@Nullable Output<String> runtimeApiVersion) {
            this.runtimeApiVersion = runtimeApiVersion;
            return this;
        }
        public Builder runtimeApiVersion(@Nullable String runtimeApiVersion) {
            this.runtimeApiVersion = Codegen.ofNullable(runtimeApiVersion);
            return this;
        }
        public Builder runtimeChannel(@Nullable Output<String> runtimeChannel) {
            this.runtimeChannel = runtimeChannel;
            return this;
        }
        public Builder runtimeChannel(@Nullable String runtimeChannel) {
            this.runtimeChannel = Codegen.ofNullable(runtimeChannel);
            return this;
        }
        public Builder runtimeMainExecutablePath(@Nullable Output<String> runtimeMainExecutablePath) {
            this.runtimeMainExecutablePath = runtimeMainExecutablePath;
            return this;
        }
        public Builder runtimeMainExecutablePath(@Nullable String runtimeMainExecutablePath) {
            this.runtimeMainExecutablePath = Codegen.ofNullable(runtimeMainExecutablePath);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder serviceId(Output<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Output.of(Objects.requireNonNull(serviceId));
            return this;
        }
        public Builder servingStatus(@Nullable Output<VersionServingStatus> servingStatus) {
            this.servingStatus = servingStatus;
            return this;
        }
        public Builder servingStatus(@Nullable VersionServingStatus servingStatus) {
            this.servingStatus = Codegen.ofNullable(servingStatus);
            return this;
        }
        public Builder threadsafe(@Nullable Output<Boolean> threadsafe) {
            this.threadsafe = threadsafe;
            return this;
        }
        public Builder threadsafe(@Nullable Boolean threadsafe) {
            this.threadsafe = Codegen.ofNullable(threadsafe);
            return this;
        }
        public Builder vm(@Nullable Output<Boolean> vm) {
            this.vm = vm;
            return this;
        }
        public Builder vm(@Nullable Boolean vm) {
            this.vm = Codegen.ofNullable(vm);
            return this;
        }
        public Builder vpcAccessConnector(@Nullable Output<VpcAccessConnectorArgs> vpcAccessConnector) {
            this.vpcAccessConnector = vpcAccessConnector;
            return this;
        }
        public Builder vpcAccessConnector(@Nullable VpcAccessConnectorArgs vpcAccessConnector) {
            this.vpcAccessConnector = Codegen.ofNullable(vpcAccessConnector);
            return this;
        }        public VersionArgs build() {
            return new VersionArgs(apiConfig, appId, automaticScaling, basicScaling, betaSettings, buildEnvVariables, defaultExpiration, deployment, endpointsApiService, entrypoint, env, envVariables, errorHandlers, handlers, healthCheck, id, inboundServices, instanceClass, libraries, livenessCheck, manualScaling, network, nobuildFilesRegex, readinessCheck, resources, runtime, runtimeApiVersion, runtimeChannel, runtimeMainExecutablePath, serviceAccount, serviceId, servingStatus, threadsafe, vm, vpcAccessConnector);
        }
    }
}
