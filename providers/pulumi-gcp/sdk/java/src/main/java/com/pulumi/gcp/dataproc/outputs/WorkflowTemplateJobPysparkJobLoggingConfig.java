// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplateJobPysparkJobLoggingConfig {
    /**
     * The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
     */
    private final @Nullable Map<String,String> driverLogLevels;

    @CustomType.Constructor
    private WorkflowTemplateJobPysparkJobLoggingConfig(@CustomType.Parameter("driverLogLevels") @Nullable Map<String,String> driverLogLevels) {
        this.driverLogLevels = driverLogLevels;
    }

    /**
     * The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
    */
    public Map<String,String> driverLogLevels() {
        return this.driverLogLevels == null ? Map.of() : this.driverLogLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPysparkJobLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPysparkJobLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(@Nullable Map<String,String> driverLogLevels) {
            this.driverLogLevels = driverLogLevels;
            return this;
        }        public WorkflowTemplateJobPysparkJobLoggingConfig build() {
            return new WorkflowTemplateJobPysparkJobLoggingConfig(driverLogLevels);
        }
    }
}
