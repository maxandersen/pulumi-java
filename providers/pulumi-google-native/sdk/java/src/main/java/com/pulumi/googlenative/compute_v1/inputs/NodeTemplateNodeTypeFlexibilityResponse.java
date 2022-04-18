// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NodeTemplateNodeTypeFlexibilityResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeTemplateNodeTypeFlexibilityResponse Empty = new NodeTemplateNodeTypeFlexibilityResponse();

    @Import(name="cpus", required=true)
      private final String cpus;

    public String cpus() {
        return this.cpus;
    }

    @Import(name="localSsd", required=true)
      private final String localSsd;

    public String localSsd() {
        return this.localSsd;
    }

    @Import(name="memory", required=true)
      private final String memory;

    public String memory() {
        return this.memory;
    }

    public NodeTemplateNodeTypeFlexibilityResponse(
        String cpus,
        String localSsd,
        String memory) {
        this.cpus = Objects.requireNonNull(cpus, "expected parameter 'cpus' to be non-null");
        this.localSsd = Objects.requireNonNull(localSsd, "expected parameter 'localSsd' to be non-null");
        this.memory = Objects.requireNonNull(memory, "expected parameter 'memory' to be non-null");
    }

    private NodeTemplateNodeTypeFlexibilityResponse() {
        this.cpus = null;
        this.localSsd = null;
        this.memory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateNodeTypeFlexibilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpus;
        private String localSsd;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateNodeTypeFlexibilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpus = defaults.cpus;
    	      this.localSsd = defaults.localSsd;
    	      this.memory = defaults.memory;
        }

        public Builder cpus(String cpus) {
            this.cpus = Objects.requireNonNull(cpus);
            return this;
        }
        public Builder localSsd(String localSsd) {
            this.localSsd = Objects.requireNonNull(localSsd);
            return this;
        }
        public Builder memory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }        public NodeTemplateNodeTypeFlexibilityResponse build() {
            return new NodeTemplateNodeTypeFlexibilityResponse(cpus, localSsd, memory);
        }
    }
}
