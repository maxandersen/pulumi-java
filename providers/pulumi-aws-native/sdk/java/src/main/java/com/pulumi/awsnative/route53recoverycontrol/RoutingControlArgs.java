// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutingControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutingControlArgs Empty = new RoutingControlArgs();

    /**
     * Arn associated with Control Panel
     * 
     */
    @Import(name="clusterArn")
      private final @Nullable Output<String> clusterArn;

    public Output<String> clusterArn() {
        return this.clusterArn == null ? Codegen.empty() : this.clusterArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the control panel.
     * 
     */
    @Import(name="controlPanelArn")
      private final @Nullable Output<String> controlPanelArn;

    public Output<String> controlPanelArn() {
        return this.controlPanelArn == null ? Codegen.empty() : this.controlPanelArn;
    }

    /**
     * The name of the routing control. You can use any non-white space character in the name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public RoutingControlArgs(
        @Nullable Output<String> clusterArn,
        @Nullable Output<String> controlPanelArn,
        @Nullable Output<String> name) {
        this.clusterArn = clusterArn;
        this.controlPanelArn = controlPanelArn;
        this.name = name;
    }

    private RoutingControlArgs() {
        this.clusterArn = Codegen.empty();
        this.controlPanelArn = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterArn;
        private @Nullable Output<String> controlPanelArn;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.name = defaults.name;
        }

        public Builder clusterArn(@Nullable Output<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }
        public Builder clusterArn(@Nullable String clusterArn) {
            this.clusterArn = Codegen.ofNullable(clusterArn);
            return this;
        }
        public Builder controlPanelArn(@Nullable Output<String> controlPanelArn) {
            this.controlPanelArn = controlPanelArn;
            return this;
        }
        public Builder controlPanelArn(@Nullable String controlPanelArn) {
            this.controlPanelArn = Codegen.ofNullable(controlPanelArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public RoutingControlArgs build() {
            return new RoutingControlArgs(clusterArn, controlPanelArn, name);
        }
    }
}
