// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DirectoryConnectSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DirectoryConnectSettingsArgs Empty = new DirectoryConnectSettingsArgs();

    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * The IP addresses of the AD Connector servers.
     * 
     */
    @Import(name="connectIps")
    private @Nullable Output<List<String>> connectIps;

    public Optional<Output<List<String>>> connectIps() {
        return Optional.ofNullable(this.connectIps);
    }

    /**
     * The DNS IP addresses of the domain to connect to.
     * 
     */
    @Import(name="customerDnsIps", required=true)
    private Output<List<String>> customerDnsIps;

    public Output<List<String>> customerDnsIps() {
        return this.customerDnsIps;
    }

    /**
     * The username corresponding to the password provided.
     * 
     */
    @Import(name="customerUsername", required=true)
    private Output<String> customerUsername;

    public Output<String> customerUsername() {
        return this.customerUsername;
    }

    /**
     * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * The identifier of the VPC that the directory is in.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    private DirectoryConnectSettingsArgs() {}

    private DirectoryConnectSettingsArgs(DirectoryConnectSettingsArgs $) {
        this.availabilityZones = $.availabilityZones;
        this.connectIps = $.connectIps;
        this.customerDnsIps = $.customerDnsIps;
        this.customerUsername = $.customerUsername;
        this.subnetIds = $.subnetIds;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DirectoryConnectSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DirectoryConnectSettingsArgs $;

        public Builder() {
            $ = new DirectoryConnectSettingsArgs();
        }

        public Builder(DirectoryConnectSettingsArgs defaults) {
            $ = new DirectoryConnectSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        public Builder connectIps(@Nullable Output<List<String>> connectIps) {
            $.connectIps = connectIps;
            return this;
        }

        public Builder connectIps(List<String> connectIps) {
            return connectIps(Output.of(connectIps));
        }

        public Builder connectIps(String... connectIps) {
            return connectIps(List.of(connectIps));
        }

        public Builder customerDnsIps(Output<List<String>> customerDnsIps) {
            $.customerDnsIps = customerDnsIps;
            return this;
        }

        public Builder customerDnsIps(List<String> customerDnsIps) {
            return customerDnsIps(Output.of(customerDnsIps));
        }

        public Builder customerDnsIps(String... customerDnsIps) {
            return customerDnsIps(List.of(customerDnsIps));
        }

        public Builder customerUsername(Output<String> customerUsername) {
            $.customerUsername = customerUsername;
            return this;
        }

        public Builder customerUsername(String customerUsername) {
            return customerUsername(Output.of(customerUsername));
        }

        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public DirectoryConnectSettingsArgs build() {
            $.customerDnsIps = Objects.requireNonNull($.customerDnsIps, "expected parameter 'customerDnsIps' to be non-null");
            $.customerUsername = Objects.requireNonNull($.customerUsername, "expected parameter 'customerUsername' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
