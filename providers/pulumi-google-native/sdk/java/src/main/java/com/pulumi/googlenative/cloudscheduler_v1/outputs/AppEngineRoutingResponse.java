// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppEngineRoutingResponse {
    /**
     * The host that the job is sent to. For more information about how App Engine requests are routed, see [here](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed). The host is constructed as: * `host = [application_domain_name]` `| [service] + &#39;.&#39; + [application_domain_name]` `| [version] + &#39;.&#39; + [application_domain_name]` `| [version_dot_service]+ &#39;.&#39; + [application_domain_name]` `| [instance] + &#39;.&#39; + [application_domain_name]` `| [instance_dot_service] + &#39;.&#39; + [application_domain_name]` `| [instance_dot_version] + &#39;.&#39; + [application_domain_name]` `| [instance_dot_version_dot_service] + &#39;.&#39; + [application_domain_name]` * `application_domain_name` = The domain name of the app, for example .appspot.com, which is associated with the job&#39;s project ID. * `service =` service * `version =` version * `version_dot_service =` version `+ &#39;.&#39; +` service * `instance =` instance * `instance_dot_service =` instance `+ &#39;.&#39; +` service * `instance_dot_version =` instance `+ &#39;.&#39; +` version * `instance_dot_version_dot_service =` instance `+ &#39;.&#39; +` version `+ &#39;.&#39; +` service If service is empty, then the job will be sent to the service which is the default service when the job is attempted. If version is empty, then the job will be sent to the version which is the default version when the job is attempted. If instance is empty, then the job will be sent to an instance which is available when the job is attempted. If service, version, or instance is invalid, then the job will be sent to the default version of the default service when the job is attempted.
     * 
     */
    private final String host;
    /**
     * App instance. By default, the job is sent to an instance which is available when the job is attempted. Requests can only be sent to a specific instance if [manual scaling is used in App Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support instances. For more information, see [App Engine Standard request routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
     * 
     */
    private final String instance;
    /**
     * App service. By default, the job is sent to the service which is the default service when the job is attempted.
     * 
     */
    private final String service;
    /**
     * App version. By default, the job is sent to the version which is the default version when the job is attempted.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private AppEngineRoutingResponse(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("instance") String instance,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("version") String version) {
        this.host = host;
        this.instance = instance;
        this.service = service;
        this.version = version;
    }

    /**
     * The host that the job is sent to. For more information about how App Engine requests are routed, see [here](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed). The host is constructed as: * `host = [application_domain_name]` `| [service] + &#39;.&#39; + [application_domain_name]` `| [version] + &#39;.&#39; + [application_domain_name]` `| [version_dot_service]+ &#39;.&#39; + [application_domain_name]` `| [instance] + &#39;.&#39; + [application_domain_name]` `| [instance_dot_service] + &#39;.&#39; + [application_domain_name]` `| [instance_dot_version] + &#39;.&#39; + [application_domain_name]` `| [instance_dot_version_dot_service] + &#39;.&#39; + [application_domain_name]` * `application_domain_name` = The domain name of the app, for example .appspot.com, which is associated with the job&#39;s project ID. * `service =` service * `version =` version * `version_dot_service =` version `+ &#39;.&#39; +` service * `instance =` instance * `instance_dot_service =` instance `+ &#39;.&#39; +` service * `instance_dot_version =` instance `+ &#39;.&#39; +` version * `instance_dot_version_dot_service =` instance `+ &#39;.&#39; +` version `+ &#39;.&#39; +` service If service is empty, then the job will be sent to the service which is the default service when the job is attempted. If version is empty, then the job will be sent to the version which is the default version when the job is attempted. If instance is empty, then the job will be sent to an instance which is available when the job is attempted. If service, version, or instance is invalid, then the job will be sent to the default version of the default service when the job is attempted.
     * 
    */
    public String host() {
        return this.host;
    }
    /**
     * App instance. By default, the job is sent to an instance which is available when the job is attempted. Requests can only be sent to a specific instance if [manual scaling is used in App Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support instances. For more information, see [App Engine Standard request routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
     * 
    */
    public String instance() {
        return this.instance;
    }
    /**
     * App service. By default, the job is sent to the service which is the default service when the job is attempted.
     * 
    */
    public String service() {
        return this.service;
    }
    /**
     * App version. By default, the job is sent to the version which is the default version when the job is attempted.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineRoutingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String instance;
        private String service;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineRoutingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.instance = defaults.instance;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public AppEngineRoutingResponse build() {
            return new AppEngineRoutingResponse(host, instance, service, version);
        }
    }
}
