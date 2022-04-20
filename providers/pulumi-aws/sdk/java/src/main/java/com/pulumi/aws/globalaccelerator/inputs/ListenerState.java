// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator.inputs;

import com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerState extends com.pulumi.resources.ResourceArgs {

    public static final ListenerState Empty = new ListenerState();

    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     * 
     */
    @Import(name="acceleratorArn")
      private final @Nullable Output<String> acceleratorArn;

    public Output<String> acceleratorArn() {
        return this.acceleratorArn == null ? Codegen.empty() : this.acceleratorArn;
    }

    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the &#34;five-tuple&#34; properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the &#34;two-tuple&#34; properties of source (client) IP address and destination IP address to select the hash value.
     * 
     */
    @Import(name="clientAffinity")
      private final @Nullable Output<String> clientAffinity;

    public Output<String> clientAffinity() {
        return this.clientAffinity == null ? Codegen.empty() : this.clientAffinity;
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * 
     */
    @Import(name="portRanges")
      private final @Nullable Output<List<ListenerPortRangeGetArgs>> portRanges;

    public Output<List<ListenerPortRangeGetArgs>> portRanges() {
        return this.portRanges == null ? Codegen.empty() : this.portRanges;
    }

    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    public ListenerState(
        @Nullable Output<String> acceleratorArn,
        @Nullable Output<String> clientAffinity,
        @Nullable Output<List<ListenerPortRangeGetArgs>> portRanges,
        @Nullable Output<String> protocol) {
        this.acceleratorArn = acceleratorArn;
        this.clientAffinity = clientAffinity;
        this.portRanges = portRanges;
        this.protocol = protocol;
    }

    private ListenerState() {
        this.acceleratorArn = Codegen.empty();
        this.clientAffinity = Codegen.empty();
        this.portRanges = Codegen.empty();
        this.protocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceleratorArn;
        private @Nullable Output<String> clientAffinity;
        private @Nullable Output<List<ListenerPortRangeGetArgs>> portRanges;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorArn = defaults.acceleratorArn;
    	      this.clientAffinity = defaults.clientAffinity;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
        }

        public Builder acceleratorArn(@Nullable Output<String> acceleratorArn) {
            this.acceleratorArn = acceleratorArn;
            return this;
        }
        public Builder acceleratorArn(@Nullable String acceleratorArn) {
            this.acceleratorArn = Codegen.ofNullable(acceleratorArn);
            return this;
        }
        public Builder clientAffinity(@Nullable Output<String> clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }
        public Builder clientAffinity(@Nullable String clientAffinity) {
            this.clientAffinity = Codegen.ofNullable(clientAffinity);
            return this;
        }
        public Builder portRanges(@Nullable Output<List<ListenerPortRangeGetArgs>> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public Builder portRanges(@Nullable List<ListenerPortRangeGetArgs> portRanges) {
            this.portRanges = Codegen.ofNullable(portRanges);
            return this;
        }
        public Builder portRanges(ListenerPortRangeGetArgs... portRanges) {
            return portRanges(List.of(portRanges));
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }        public ListenerState build() {
            return new ListenerState(acceleratorArn, clientAffinity, portRanges, protocol);
        }
    }
}
