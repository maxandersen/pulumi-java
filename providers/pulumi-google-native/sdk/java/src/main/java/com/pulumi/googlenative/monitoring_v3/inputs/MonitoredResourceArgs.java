// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * An object representing a resource that can be used for monitoring, logging, billing, or other purposes. Examples include virtual machine instances, databases, and storage devices such as disks. The type field identifies a MonitoredResourceDescriptor object that describes the resource&#39;s schema. Information in the labels field identifies the actual resource and its attributes according to the schema. For example, a particular Compute Engine VM instance could be represented by the following object, because the MonitoredResourceDescriptor for &#34;gce_instance&#34; has labels &#34;project_id&#34;, &#34;instance_id&#34; and &#34;zone&#34;: { &#34;type&#34;: &#34;gce_instance&#34;, &#34;labels&#34;: { &#34;project_id&#34;: &#34;my-project&#34;, &#34;instance_id&#34;: &#34;12345678901234&#34;, &#34;zone&#34;: &#34;us-central1-a&#34; }}
 * 
 */
public final class MonitoredResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredResourceArgs Empty = new MonitoredResourceArgs();

    /**
     * Values for all of the labels listed in the associated monitored resource descriptor. For example, Compute Engine VM instances use the labels &#34;project_id&#34;, &#34;instance_id&#34;, and &#34;zone&#34;.
     * 
     */
    @Import(name="labels", required=true)
      private final Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels;
    }

    /**
     * The monitored resource type. This field must match the type field of a MonitoredResourceDescriptor object. For example, the type of a Compute Engine VM instance is gce_instance. For a list of types, see Monitoring resource types (https://cloud.google.com/monitoring/api/resources) and Logging resource types (https://cloud.google.com/logging/docs/api/v2/resource-list).
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public MonitoredResourceArgs(
        Output<Map<String,String>> labels,
        Output<String> type) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MonitoredResourceArgs() {
        this.labels = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> labels;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.type = defaults.type;
        }

        public Builder labels(Output<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Output.of(Objects.requireNonNull(labels));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public MonitoredResourceArgs build() {
            return new MonitoredResourceArgs(labels, type);
        }
    }
}
