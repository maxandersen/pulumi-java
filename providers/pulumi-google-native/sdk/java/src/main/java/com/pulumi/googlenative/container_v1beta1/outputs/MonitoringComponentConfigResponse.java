// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MonitoringComponentConfigResponse {
    /**
     * @return Select components to collect metrics. An empty set would disable all monitoring.
     * 
     */
    private final List<String> enableComponents;

    @CustomType.Constructor
    private MonitoringComponentConfigResponse(@CustomType.Parameter("enableComponents") List<String> enableComponents) {
        this.enableComponents = enableComponents;
    }

    /**
     * @return Select components to collect metrics. An empty set would disable all monitoring.
     * 
     */
    public List<String> enableComponents() {
        return this.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringComponentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringComponentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder enableComponents(List<String> enableComponents) {
            this.enableComponents = Objects.requireNonNull(enableComponents);
            return this;
        }
        public Builder enableComponents(String... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }        public MonitoringComponentConfigResponse build() {
            return new MonitoringComponentConfigResponse(enableComponents);
        }
    }
}
