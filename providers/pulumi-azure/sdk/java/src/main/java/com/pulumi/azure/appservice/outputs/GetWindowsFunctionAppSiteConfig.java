// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppSiteConfigAppServiceLog;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppSiteConfigApplicationStack;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppSiteConfigCor;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppSiteConfigIpRestriction;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppSiteConfigScmIpRestriction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsFunctionAppSiteConfig {
    /**
     * @return Is this Windows Function App Always On?.
     * 
     */
    private final Boolean alwaysOn;
    /**
     * @return The URL of the API definition that describes this Windows Function App.
     * 
     */
    private final String apiDefinitionUrl;
    /**
     * @return The ID of the API Management API for this Windows Function App.
     * 
     */
    private final String apiManagementApiId;
    /**
     * @return The App command line to launch.
     * 
     */
    private final String appCommandLine;
    /**
     * @return The number of workers this function app can scale out to.
     * 
     */
    private final Integer appScaleLimit;
    /**
     * @return A `app_service_logs` block as defined above.
     * 
     */
    private final List<GetWindowsFunctionAppSiteConfigAppServiceLog> appServiceLogs;
    /**
     * @return The Connection String for linking the Windows Function App to Application Insights.
     * 
     */
    private final String applicationInsightsConnectionString;
    /**
     * @return The Instrumentation Key for connecting the Windows Function App to Application Insights.
     * 
     */
    private final String applicationInsightsKey;
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    private final List<GetWindowsFunctionAppSiteConfigApplicationStack> applicationStacks;
    /**
     * @return A `cors` block as defined above.
     * 
     */
    private final List<GetWindowsFunctionAppSiteConfigCor> cors;
    /**
     * @return A list of Default Documents for the Windows Web App.
     * 
     */
    private final List<String> defaultDocuments;
    /**
     * @return Is detailed error logging enabled?
     * 
     */
    private final Boolean detailedErrorLoggingEnabled;
    /**
     * @return The number of minimum instances for this Windows Function App.
     * 
     */
    private final Integer elasticInstanceMinimum;
    /**
     * @return State of FTP / FTPS service for this Windows Function App.
     * 
     */
    private final String ftpsState;
    /**
     * @return The amount of time in minutes that a node can be unhealthy before being removed from the load balancer.
     * 
     */
    private final Integer healthCheckEvictionTimeInMin;
    /**
     * @return The path to be checked for this Windows Function App health.
     * 
     */
    private final String healthCheckPath;
    /**
     * @return Is the HTTP2 protocol enabled?
     * 
     */
    private final Boolean http2Enabled;
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    private final List<GetWindowsFunctionAppSiteConfigIpRestriction> ipRestrictions;
    /**
     * @return The Site load balancing mode.
     * 
     */
    private final String loadBalancingMode;
    /**
     * @return The Managed pipeline mode.
     * 
     */
    private final String managedPipelineMode;
    /**
     * @return The minimum version of TLS required for SSL requests.
     * 
     */
    private final String minimumTlsVersion;
    /**
     * @return The number of pre-warmed instances for this Windows Function App.
     * 
     */
    private final Integer preWarmedInstanceCount;
    /**
     * @return Is Remote Debugging enabled?
     * 
     */
    private final Boolean remoteDebuggingEnabled;
    /**
     * @return The Remote Debugging Version.
     * 
     */
    private final String remoteDebuggingVersion;
    /**
     * @return Is Scale Monitoring of the Functions Runtime enabled?
     * 
     */
    private final Boolean runtimeScaleMonitoringEnabled;
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    private final List<GetWindowsFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return The minimum version of TLS required for SSL requests to the SCM site.
     * 
     */
    private final String scmMinimumTlsVersion;
    /**
     * @return The SCM type.
     * 
     */
    private final String scmType;
    /**
     * @return Is the `ip_restriction` configuration used for the SCM?.
     * 
     */
    private final Boolean scmUseMainIpRestriction;
    /**
     * @return Is the Windows Function App using a 32-bit worker process?
     * 
     */
    private final Boolean use32BitWorker;
    /**
     * @return Are all outbound traffic to Virtual Network Security Groups and User Defined Routes applied?
     * 
     */
    private final Boolean vnetRouteAllEnabled;
    /**
     * @return Are Web Sockets enabled?
     * 
     */
    private final Boolean websocketsEnabled;
    /**
     * @return The Windows FX version.
     * 
     */
    private final String windowsFxVersion;
    /**
     * @return The number of Workers for this Windows Function App.
     * 
     */
    private final Integer workerCount;

    @CustomType.Constructor
    private GetWindowsFunctionAppSiteConfig(
        @CustomType.Parameter("alwaysOn") Boolean alwaysOn,
        @CustomType.Parameter("apiDefinitionUrl") String apiDefinitionUrl,
        @CustomType.Parameter("apiManagementApiId") String apiManagementApiId,
        @CustomType.Parameter("appCommandLine") String appCommandLine,
        @CustomType.Parameter("appScaleLimit") Integer appScaleLimit,
        @CustomType.Parameter("appServiceLogs") List<GetWindowsFunctionAppSiteConfigAppServiceLog> appServiceLogs,
        @CustomType.Parameter("applicationInsightsConnectionString") String applicationInsightsConnectionString,
        @CustomType.Parameter("applicationInsightsKey") String applicationInsightsKey,
        @CustomType.Parameter("applicationStacks") List<GetWindowsFunctionAppSiteConfigApplicationStack> applicationStacks,
        @CustomType.Parameter("cors") List<GetWindowsFunctionAppSiteConfigCor> cors,
        @CustomType.Parameter("defaultDocuments") List<String> defaultDocuments,
        @CustomType.Parameter("detailedErrorLoggingEnabled") Boolean detailedErrorLoggingEnabled,
        @CustomType.Parameter("elasticInstanceMinimum") Integer elasticInstanceMinimum,
        @CustomType.Parameter("ftpsState") String ftpsState,
        @CustomType.Parameter("healthCheckEvictionTimeInMin") Integer healthCheckEvictionTimeInMin,
        @CustomType.Parameter("healthCheckPath") String healthCheckPath,
        @CustomType.Parameter("http2Enabled") Boolean http2Enabled,
        @CustomType.Parameter("ipRestrictions") List<GetWindowsFunctionAppSiteConfigIpRestriction> ipRestrictions,
        @CustomType.Parameter("loadBalancingMode") String loadBalancingMode,
        @CustomType.Parameter("managedPipelineMode") String managedPipelineMode,
        @CustomType.Parameter("minimumTlsVersion") String minimumTlsVersion,
        @CustomType.Parameter("preWarmedInstanceCount") Integer preWarmedInstanceCount,
        @CustomType.Parameter("remoteDebuggingEnabled") Boolean remoteDebuggingEnabled,
        @CustomType.Parameter("remoteDebuggingVersion") String remoteDebuggingVersion,
        @CustomType.Parameter("runtimeScaleMonitoringEnabled") Boolean runtimeScaleMonitoringEnabled,
        @CustomType.Parameter("scmIpRestrictions") List<GetWindowsFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions,
        @CustomType.Parameter("scmMinimumTlsVersion") String scmMinimumTlsVersion,
        @CustomType.Parameter("scmType") String scmType,
        @CustomType.Parameter("scmUseMainIpRestriction") Boolean scmUseMainIpRestriction,
        @CustomType.Parameter("use32BitWorker") Boolean use32BitWorker,
        @CustomType.Parameter("vnetRouteAllEnabled") Boolean vnetRouteAllEnabled,
        @CustomType.Parameter("websocketsEnabled") Boolean websocketsEnabled,
        @CustomType.Parameter("windowsFxVersion") String windowsFxVersion,
        @CustomType.Parameter("workerCount") Integer workerCount) {
        this.alwaysOn = alwaysOn;
        this.apiDefinitionUrl = apiDefinitionUrl;
        this.apiManagementApiId = apiManagementApiId;
        this.appCommandLine = appCommandLine;
        this.appScaleLimit = appScaleLimit;
        this.appServiceLogs = appServiceLogs;
        this.applicationInsightsConnectionString = applicationInsightsConnectionString;
        this.applicationInsightsKey = applicationInsightsKey;
        this.applicationStacks = applicationStacks;
        this.cors = cors;
        this.defaultDocuments = defaultDocuments;
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
        this.elasticInstanceMinimum = elasticInstanceMinimum;
        this.ftpsState = ftpsState;
        this.healthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
        this.healthCheckPath = healthCheckPath;
        this.http2Enabled = http2Enabled;
        this.ipRestrictions = ipRestrictions;
        this.loadBalancingMode = loadBalancingMode;
        this.managedPipelineMode = managedPipelineMode;
        this.minimumTlsVersion = minimumTlsVersion;
        this.preWarmedInstanceCount = preWarmedInstanceCount;
        this.remoteDebuggingEnabled = remoteDebuggingEnabled;
        this.remoteDebuggingVersion = remoteDebuggingVersion;
        this.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
        this.scmIpRestrictions = scmIpRestrictions;
        this.scmMinimumTlsVersion = scmMinimumTlsVersion;
        this.scmType = scmType;
        this.scmUseMainIpRestriction = scmUseMainIpRestriction;
        this.use32BitWorker = use32BitWorker;
        this.vnetRouteAllEnabled = vnetRouteAllEnabled;
        this.websocketsEnabled = websocketsEnabled;
        this.windowsFxVersion = windowsFxVersion;
        this.workerCount = workerCount;
    }

    /**
     * @return Is this Windows Function App Always On?.
     * 
     */
    public Boolean alwaysOn() {
        return this.alwaysOn;
    }
    /**
     * @return The URL of the API definition that describes this Windows Function App.
     * 
     */
    public String apiDefinitionUrl() {
        return this.apiDefinitionUrl;
    }
    /**
     * @return The ID of the API Management API for this Windows Function App.
     * 
     */
    public String apiManagementApiId() {
        return this.apiManagementApiId;
    }
    /**
     * @return The App command line to launch.
     * 
     */
    public String appCommandLine() {
        return this.appCommandLine;
    }
    /**
     * @return The number of workers this function app can scale out to.
     * 
     */
    public Integer appScaleLimit() {
        return this.appScaleLimit;
    }
    /**
     * @return A `app_service_logs` block as defined above.
     * 
     */
    public List<GetWindowsFunctionAppSiteConfigAppServiceLog> appServiceLogs() {
        return this.appServiceLogs;
    }
    /**
     * @return The Connection String for linking the Windows Function App to Application Insights.
     * 
     */
    public String applicationInsightsConnectionString() {
        return this.applicationInsightsConnectionString;
    }
    /**
     * @return The Instrumentation Key for connecting the Windows Function App to Application Insights.
     * 
     */
    public String applicationInsightsKey() {
        return this.applicationInsightsKey;
    }
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    public List<GetWindowsFunctionAppSiteConfigApplicationStack> applicationStacks() {
        return this.applicationStacks;
    }
    /**
     * @return A `cors` block as defined above.
     * 
     */
    public List<GetWindowsFunctionAppSiteConfigCor> cors() {
        return this.cors;
    }
    /**
     * @return A list of Default Documents for the Windows Web App.
     * 
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments;
    }
    /**
     * @return Is detailed error logging enabled?
     * 
     */
    public Boolean detailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }
    /**
     * @return The number of minimum instances for this Windows Function App.
     * 
     */
    public Integer elasticInstanceMinimum() {
        return this.elasticInstanceMinimum;
    }
    /**
     * @return State of FTP / FTPS service for this Windows Function App.
     * 
     */
    public String ftpsState() {
        return this.ftpsState;
    }
    /**
     * @return The amount of time in minutes that a node can be unhealthy before being removed from the load balancer.
     * 
     */
    public Integer healthCheckEvictionTimeInMin() {
        return this.healthCheckEvictionTimeInMin;
    }
    /**
     * @return The path to be checked for this Windows Function App health.
     * 
     */
    public String healthCheckPath() {
        return this.healthCheckPath;
    }
    /**
     * @return Is the HTTP2 protocol enabled?
     * 
     */
    public Boolean http2Enabled() {
        return this.http2Enabled;
    }
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    public List<GetWindowsFunctionAppSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions;
    }
    /**
     * @return The Site load balancing mode.
     * 
     */
    public String loadBalancingMode() {
        return this.loadBalancingMode;
    }
    /**
     * @return The Managed pipeline mode.
     * 
     */
    public String managedPipelineMode() {
        return this.managedPipelineMode;
    }
    /**
     * @return The minimum version of TLS required for SSL requests.
     * 
     */
    public String minimumTlsVersion() {
        return this.minimumTlsVersion;
    }
    /**
     * @return The number of pre-warmed instances for this Windows Function App.
     * 
     */
    public Integer preWarmedInstanceCount() {
        return this.preWarmedInstanceCount;
    }
    /**
     * @return Is Remote Debugging enabled?
     * 
     */
    public Boolean remoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }
    /**
     * @return The Remote Debugging Version.
     * 
     */
    public String remoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }
    /**
     * @return Is Scale Monitoring of the Functions Runtime enabled?
     * 
     */
    public Boolean runtimeScaleMonitoringEnabled() {
        return this.runtimeScaleMonitoringEnabled;
    }
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    public List<GetWindowsFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions;
    }
    /**
     * @return The minimum version of TLS required for SSL requests to the SCM site.
     * 
     */
    public String scmMinimumTlsVersion() {
        return this.scmMinimumTlsVersion;
    }
    /**
     * @return The SCM type.
     * 
     */
    public String scmType() {
        return this.scmType;
    }
    /**
     * @return Is the `ip_restriction` configuration used for the SCM?.
     * 
     */
    public Boolean scmUseMainIpRestriction() {
        return this.scmUseMainIpRestriction;
    }
    /**
     * @return Is the Windows Function App using a 32-bit worker process?
     * 
     */
    public Boolean use32BitWorker() {
        return this.use32BitWorker;
    }
    /**
     * @return Are all outbound traffic to Virtual Network Security Groups and User Defined Routes applied?
     * 
     */
    public Boolean vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }
    /**
     * @return Are Web Sockets enabled?
     * 
     */
    public Boolean websocketsEnabled() {
        return this.websocketsEnabled;
    }
    /**
     * @return The Windows FX version.
     * 
     */
    public String windowsFxVersion() {
        return this.windowsFxVersion;
    }
    /**
     * @return The number of Workers for this Windows Function App.
     * 
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsFunctionAppSiteConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean alwaysOn;
        private String apiDefinitionUrl;
        private String apiManagementApiId;
        private String appCommandLine;
        private Integer appScaleLimit;
        private List<GetWindowsFunctionAppSiteConfigAppServiceLog> appServiceLogs;
        private String applicationInsightsConnectionString;
        private String applicationInsightsKey;
        private List<GetWindowsFunctionAppSiteConfigApplicationStack> applicationStacks;
        private List<GetWindowsFunctionAppSiteConfigCor> cors;
        private List<String> defaultDocuments;
        private Boolean detailedErrorLoggingEnabled;
        private Integer elasticInstanceMinimum;
        private String ftpsState;
        private Integer healthCheckEvictionTimeInMin;
        private String healthCheckPath;
        private Boolean http2Enabled;
        private List<GetWindowsFunctionAppSiteConfigIpRestriction> ipRestrictions;
        private String loadBalancingMode;
        private String managedPipelineMode;
        private String minimumTlsVersion;
        private Integer preWarmedInstanceCount;
        private Boolean remoteDebuggingEnabled;
        private String remoteDebuggingVersion;
        private Boolean runtimeScaleMonitoringEnabled;
        private List<GetWindowsFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions;
        private String scmMinimumTlsVersion;
        private String scmType;
        private Boolean scmUseMainIpRestriction;
        private Boolean use32BitWorker;
        private Boolean vnetRouteAllEnabled;
        private Boolean websocketsEnabled;
        private String windowsFxVersion;
        private Integer workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWindowsFunctionAppSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.apiDefinitionUrl = defaults.apiDefinitionUrl;
    	      this.apiManagementApiId = defaults.apiManagementApiId;
    	      this.appCommandLine = defaults.appCommandLine;
    	      this.appScaleLimit = defaults.appScaleLimit;
    	      this.appServiceLogs = defaults.appServiceLogs;
    	      this.applicationInsightsConnectionString = defaults.applicationInsightsConnectionString;
    	      this.applicationInsightsKey = defaults.applicationInsightsKey;
    	      this.applicationStacks = defaults.applicationStacks;
    	      this.cors = defaults.cors;
    	      this.defaultDocuments = defaults.defaultDocuments;
    	      this.detailedErrorLoggingEnabled = defaults.detailedErrorLoggingEnabled;
    	      this.elasticInstanceMinimum = defaults.elasticInstanceMinimum;
    	      this.ftpsState = defaults.ftpsState;
    	      this.healthCheckEvictionTimeInMin = defaults.healthCheckEvictionTimeInMin;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.ipRestrictions = defaults.ipRestrictions;
    	      this.loadBalancingMode = defaults.loadBalancingMode;
    	      this.managedPipelineMode = defaults.managedPipelineMode;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.preWarmedInstanceCount = defaults.preWarmedInstanceCount;
    	      this.remoteDebuggingEnabled = defaults.remoteDebuggingEnabled;
    	      this.remoteDebuggingVersion = defaults.remoteDebuggingVersion;
    	      this.runtimeScaleMonitoringEnabled = defaults.runtimeScaleMonitoringEnabled;
    	      this.scmIpRestrictions = defaults.scmIpRestrictions;
    	      this.scmMinimumTlsVersion = defaults.scmMinimumTlsVersion;
    	      this.scmType = defaults.scmType;
    	      this.scmUseMainIpRestriction = defaults.scmUseMainIpRestriction;
    	      this.use32BitWorker = defaults.use32BitWorker;
    	      this.vnetRouteAllEnabled = defaults.vnetRouteAllEnabled;
    	      this.websocketsEnabled = defaults.websocketsEnabled;
    	      this.windowsFxVersion = defaults.windowsFxVersion;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder alwaysOn(Boolean alwaysOn) {
            this.alwaysOn = Objects.requireNonNull(alwaysOn);
            return this;
        }
        public Builder apiDefinitionUrl(String apiDefinitionUrl) {
            this.apiDefinitionUrl = Objects.requireNonNull(apiDefinitionUrl);
            return this;
        }
        public Builder apiManagementApiId(String apiManagementApiId) {
            this.apiManagementApiId = Objects.requireNonNull(apiManagementApiId);
            return this;
        }
        public Builder appCommandLine(String appCommandLine) {
            this.appCommandLine = Objects.requireNonNull(appCommandLine);
            return this;
        }
        public Builder appScaleLimit(Integer appScaleLimit) {
            this.appScaleLimit = Objects.requireNonNull(appScaleLimit);
            return this;
        }
        public Builder appServiceLogs(List<GetWindowsFunctionAppSiteConfigAppServiceLog> appServiceLogs) {
            this.appServiceLogs = Objects.requireNonNull(appServiceLogs);
            return this;
        }
        public Builder appServiceLogs(GetWindowsFunctionAppSiteConfigAppServiceLog... appServiceLogs) {
            return appServiceLogs(List.of(appServiceLogs));
        }
        public Builder applicationInsightsConnectionString(String applicationInsightsConnectionString) {
            this.applicationInsightsConnectionString = Objects.requireNonNull(applicationInsightsConnectionString);
            return this;
        }
        public Builder applicationInsightsKey(String applicationInsightsKey) {
            this.applicationInsightsKey = Objects.requireNonNull(applicationInsightsKey);
            return this;
        }
        public Builder applicationStacks(List<GetWindowsFunctionAppSiteConfigApplicationStack> applicationStacks) {
            this.applicationStacks = Objects.requireNonNull(applicationStacks);
            return this;
        }
        public Builder applicationStacks(GetWindowsFunctionAppSiteConfigApplicationStack... applicationStacks) {
            return applicationStacks(List.of(applicationStacks));
        }
        public Builder cors(List<GetWindowsFunctionAppSiteConfigCor> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder cors(GetWindowsFunctionAppSiteConfigCor... cors) {
            return cors(List.of(cors));
        }
        public Builder defaultDocuments(List<String> defaultDocuments) {
            this.defaultDocuments = Objects.requireNonNull(defaultDocuments);
            return this;
        }
        public Builder defaultDocuments(String... defaultDocuments) {
            return defaultDocuments(List.of(defaultDocuments));
        }
        public Builder detailedErrorLoggingEnabled(Boolean detailedErrorLoggingEnabled) {
            this.detailedErrorLoggingEnabled = Objects.requireNonNull(detailedErrorLoggingEnabled);
            return this;
        }
        public Builder elasticInstanceMinimum(Integer elasticInstanceMinimum) {
            this.elasticInstanceMinimum = Objects.requireNonNull(elasticInstanceMinimum);
            return this;
        }
        public Builder ftpsState(String ftpsState) {
            this.ftpsState = Objects.requireNonNull(ftpsState);
            return this;
        }
        public Builder healthCheckEvictionTimeInMin(Integer healthCheckEvictionTimeInMin) {
            this.healthCheckEvictionTimeInMin = Objects.requireNonNull(healthCheckEvictionTimeInMin);
            return this;
        }
        public Builder healthCheckPath(String healthCheckPath) {
            this.healthCheckPath = Objects.requireNonNull(healthCheckPath);
            return this;
        }
        public Builder http2Enabled(Boolean http2Enabled) {
            this.http2Enabled = Objects.requireNonNull(http2Enabled);
            return this;
        }
        public Builder ipRestrictions(List<GetWindowsFunctionAppSiteConfigIpRestriction> ipRestrictions) {
            this.ipRestrictions = Objects.requireNonNull(ipRestrictions);
            return this;
        }
        public Builder ipRestrictions(GetWindowsFunctionAppSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        public Builder loadBalancingMode(String loadBalancingMode) {
            this.loadBalancingMode = Objects.requireNonNull(loadBalancingMode);
            return this;
        }
        public Builder managedPipelineMode(String managedPipelineMode) {
            this.managedPipelineMode = Objects.requireNonNull(managedPipelineMode);
            return this;
        }
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            this.minimumTlsVersion = Objects.requireNonNull(minimumTlsVersion);
            return this;
        }
        public Builder preWarmedInstanceCount(Integer preWarmedInstanceCount) {
            this.preWarmedInstanceCount = Objects.requireNonNull(preWarmedInstanceCount);
            return this;
        }
        public Builder remoteDebuggingEnabled(Boolean remoteDebuggingEnabled) {
            this.remoteDebuggingEnabled = Objects.requireNonNull(remoteDebuggingEnabled);
            return this;
        }
        public Builder remoteDebuggingVersion(String remoteDebuggingVersion) {
            this.remoteDebuggingVersion = Objects.requireNonNull(remoteDebuggingVersion);
            return this;
        }
        public Builder runtimeScaleMonitoringEnabled(Boolean runtimeScaleMonitoringEnabled) {
            this.runtimeScaleMonitoringEnabled = Objects.requireNonNull(runtimeScaleMonitoringEnabled);
            return this;
        }
        public Builder scmIpRestrictions(List<GetWindowsFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions) {
            this.scmIpRestrictions = Objects.requireNonNull(scmIpRestrictions);
            return this;
        }
        public Builder scmIpRestrictions(GetWindowsFunctionAppSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        public Builder scmMinimumTlsVersion(String scmMinimumTlsVersion) {
            this.scmMinimumTlsVersion = Objects.requireNonNull(scmMinimumTlsVersion);
            return this;
        }
        public Builder scmType(String scmType) {
            this.scmType = Objects.requireNonNull(scmType);
            return this;
        }
        public Builder scmUseMainIpRestriction(Boolean scmUseMainIpRestriction) {
            this.scmUseMainIpRestriction = Objects.requireNonNull(scmUseMainIpRestriction);
            return this;
        }
        public Builder use32BitWorker(Boolean use32BitWorker) {
            this.use32BitWorker = Objects.requireNonNull(use32BitWorker);
            return this;
        }
        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            this.vnetRouteAllEnabled = Objects.requireNonNull(vnetRouteAllEnabled);
            return this;
        }
        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            this.websocketsEnabled = Objects.requireNonNull(websocketsEnabled);
            return this;
        }
        public Builder windowsFxVersion(String windowsFxVersion) {
            this.windowsFxVersion = Objects.requireNonNull(windowsFxVersion);
            return this;
        }
        public Builder workerCount(Integer workerCount) {
            this.workerCount = Objects.requireNonNull(workerCount);
            return this;
        }        public GetWindowsFunctionAppSiteConfig build() {
            return new GetWindowsFunctionAppSiteConfig(alwaysOn, apiDefinitionUrl, apiManagementApiId, appCommandLine, appScaleLimit, appServiceLogs, applicationInsightsConnectionString, applicationInsightsKey, applicationStacks, cors, defaultDocuments, detailedErrorLoggingEnabled, elasticInstanceMinimum, ftpsState, healthCheckEvictionTimeInMin, healthCheckPath, http2Enabled, ipRestrictions, loadBalancingMode, managedPipelineMode, minimumTlsVersion, preWarmedInstanceCount, remoteDebuggingEnabled, remoteDebuggingVersion, runtimeScaleMonitoringEnabled, scmIpRestrictions, scmMinimumTlsVersion, scmType, scmUseMainIpRestriction, use32BitWorker, vnetRouteAllEnabled, websocketsEnabled, windowsFxVersion, workerCount);
        }
    }
}
