// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LoggingDestinationResponse {
    /**
     * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs section. If the log name is not a domain scoped name, it will be automatically prefixed with the service name followed by "/".
     * 
     */
    private final List<String> logs;
    /**
     * The monitored resource type. The type must be defined in the Service.monitored_resources section.
     * 
     */
    private final String monitoredResource;

    @CustomType.Constructor
    private LoggingDestinationResponse(
        @CustomType.Parameter("logs") List<String> logs,
        @CustomType.Parameter("monitoredResource") String monitoredResource) {
        this.logs = logs;
        this.monitoredResource = monitoredResource;
    }

    /**
     * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs section. If the log name is not a domain scoped name, it will be automatically prefixed with the service name followed by "/".
     * 
    */
    public List<String> logs() {
        return this.logs;
    }
    /**
     * The monitored resource type. The type must be defined in the Service.monitored_resources section.
     * 
    */
    public String monitoredResource() {
        return this.monitoredResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> logs;
        private String monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder logs(List<String> logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }
        public Builder logs(String... logs) {
            return logs(List.of(logs));
        }
        public Builder monitoredResource(String monitoredResource) {
            this.monitoredResource = Objects.requireNonNull(monitoredResource);
            return this;
        }        public LoggingDestinationResponse build() {
            return new LoggingDestinationResponse(logs, monitoredResource);
        }
    }
}
