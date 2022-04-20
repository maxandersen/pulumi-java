// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPrestoJobLoggingConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPrestoJobLoggingConfigGetArgs Empty = new WorkflowTemplateJobPrestoJobLoggingConfigGetArgs();

    /**
     * The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
     */
    @Import(name="driverLogLevels")
      private final @Nullable Output<Map<String,String>> driverLogLevels;

    public Output<Map<String,String>> driverLogLevels() {
        return this.driverLogLevels == null ? Codegen.empty() : this.driverLogLevels;
    }

    public WorkflowTemplateJobPrestoJobLoggingConfigGetArgs(@Nullable Output<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = driverLogLevels;
    }

    private WorkflowTemplateJobPrestoJobLoggingConfigGetArgs() {
        this.driverLogLevels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPrestoJobLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPrestoJobLoggingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(@Nullable Output<Map<String,String>> driverLogLevels) {
            this.driverLogLevels = driverLogLevels;
            return this;
        }
        public Builder driverLogLevels(@Nullable Map<String,String> driverLogLevels) {
            this.driverLogLevels = Codegen.ofNullable(driverLogLevels);
            return this;
        }        public WorkflowTemplateJobPrestoJobLoggingConfigGetArgs build() {
            return new WorkflowTemplateJobPrestoJobLoggingConfigGetArgs(driverLogLevels);
        }
    }
}
