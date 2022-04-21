// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPrestoJobLoggingConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPrestoJobLoggingConfigGetArgs Empty = new WorkflowTemplateJobPrestoJobLoggingConfigGetArgs();

    /**
     * The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
     */
    @Import(name="driverLogLevels")
    private @Nullable Output<Map<String,String>> driverLogLevels;

    public Optional<Output<Map<String,String>>> driverLogLevels() {
        return Optional.ofNullable(this.driverLogLevels);
    }

    private WorkflowTemplateJobPrestoJobLoggingConfigGetArgs() {}

    private WorkflowTemplateJobPrestoJobLoggingConfigGetArgs(WorkflowTemplateJobPrestoJobLoggingConfigGetArgs $) {
        this.driverLogLevels = $.driverLogLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateJobPrestoJobLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateJobPrestoJobLoggingConfigGetArgs $;

        public Builder() {
            $ = new WorkflowTemplateJobPrestoJobLoggingConfigGetArgs();
        }

        public Builder(WorkflowTemplateJobPrestoJobLoggingConfigGetArgs defaults) {
            $ = new WorkflowTemplateJobPrestoJobLoggingConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder driverLogLevels(@Nullable Output<Map<String,String>> driverLogLevels) {
            $.driverLogLevels = driverLogLevels;
            return this;
        }

        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            return driverLogLevels(Output.of(driverLogLevels));
        }

        public WorkflowTemplateJobPrestoJobLoggingConfigGetArgs build() {
            return $;
        }
    }

}
