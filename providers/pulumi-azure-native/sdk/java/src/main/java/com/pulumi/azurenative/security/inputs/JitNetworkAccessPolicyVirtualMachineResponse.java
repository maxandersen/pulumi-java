// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.JitNetworkAccessPortRuleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JitNetworkAccessPolicyVirtualMachineResponse extends com.pulumi.resources.InvokeArgs {

    public static final JitNetworkAccessPolicyVirtualMachineResponse Empty = new JitNetworkAccessPolicyVirtualMachineResponse();

    /**
     * Resource ID of the virtual machine that is linked to this policy
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Port configurations for the virtual machine
     * 
     */
    @Import(name="ports", required=true)
      private final List<JitNetworkAccessPortRuleResponse> ports;

    public List<JitNetworkAccessPortRuleResponse> ports() {
        return this.ports;
    }

    /**
     * Public IP address of the Azure Firewall that is linked to this policy, if applicable
     * 
     */
    @Import(name="publicIpAddress")
      private final @Nullable String publicIpAddress;

    public Optional<String> publicIpAddress() {
        return this.publicIpAddress == null ? Optional.empty() : Optional.ofNullable(this.publicIpAddress);
    }

    public JitNetworkAccessPolicyVirtualMachineResponse(
        String id,
        List<JitNetworkAccessPortRuleResponse> ports,
        @Nullable String publicIpAddress) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
        this.publicIpAddress = publicIpAddress;
    }

    private JitNetworkAccessPolicyVirtualMachineResponse() {
        this.id = null;
        this.ports = List.of();
        this.publicIpAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessPolicyVirtualMachineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<JitNetworkAccessPortRuleResponse> ports;
        private @Nullable String publicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessPolicyVirtualMachineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ports = defaults.ports;
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ports(List<JitNetworkAccessPortRuleResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(JitNetworkAccessPortRuleResponse... ports) {
            return ports(List.of(ports));
        }
        public Builder publicIpAddress(@Nullable String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }        public JitNetworkAccessPolicyVirtualMachineResponse build() {
            return new JitNetworkAccessPolicyVirtualMachineResponse(id, ports, publicIpAddress);
        }
    }
}
