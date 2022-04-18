// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol;

import com.pulumi.awsnative.route53recoverycontrol.inputs.ControlPanelTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlPanelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControlPanelArgs Empty = new ControlPanelArgs();

    /**
     * Cluster to associate with the Control Panel
     * 
     */
    @Import(name="clusterArn")
      private final @Nullable Output<String> clusterArn;

    public Output<String> clusterArn() {
        return this.clusterArn == null ? Codegen.empty() : this.clusterArn;
    }

    /**
     * The name of the control panel. You can use any non-white space character in the name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ControlPanelTagArgs>> tags;

    public Output<List<ControlPanelTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ControlPanelArgs(
        @Nullable Output<String> clusterArn,
        @Nullable Output<String> name,
        @Nullable Output<List<ControlPanelTagArgs>> tags) {
        this.clusterArn = clusterArn;
        this.name = name;
        this.tags = tags;
    }

    private ControlPanelArgs() {
        this.clusterArn = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlPanelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterArn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ControlPanelTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlPanelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder clusterArn(@Nullable Output<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }
        public Builder clusterArn(@Nullable String clusterArn) {
            this.clusterArn = Codegen.ofNullable(clusterArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<ControlPanelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ControlPanelTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ControlPanelTagArgs... tags) {
            return tags(List.of(tags));
        }        public ControlPanelArgs build() {
            return new ControlPanelArgs(clusterArn, name, tags);
        }
    }
}
