// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EipAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final EipAssociationState Empty = new EipAssociationState();

    /**
     * The allocation ID. This is required for EC2-VPC.
     * 
     */
    @Import(name="allocationId")
    private @Nullable Output<String> allocationId;

    public Optional<Output<String>> allocationId() {
        return Optional.ofNullable(this.allocationId);
    }

    /**
     * Whether to allow an Elastic IP to
     * be re-associated. Defaults to `true` in VPC.
     * 
     */
    @Import(name="allowReassociation")
    private @Nullable Output<Boolean> allowReassociation;

    public Optional<Output<Boolean>> allowReassociation() {
        return Optional.ofNullable(this.allowReassociation);
    }

    /**
     * The ID of the instance. This is required for
     * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
     * network interface ID, but not both. The operation fails if you specify an
     * instance ID unless exactly one network interface is attached.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The ID of the network interface. If the
     * instance has more than one network interface, you must specify a network
     * interface ID.
     * 
     */
    @Import(name="networkInterfaceId")
    private @Nullable Output<String> networkInterfaceId;

    public Optional<Output<String>> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }

    /**
     * The primary or secondary private IP address
     * to associate with the Elastic IP address. If no private IP address is
     * specified, the Elastic IP address is associated with the primary private IP
     * address.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * The Elastic IP address. This is required for EC2-Classic.
     * 
     */
    @Import(name="publicIp")
    private @Nullable Output<String> publicIp;

    public Optional<Output<String>> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }

    private EipAssociationState() {}

    private EipAssociationState(EipAssociationState $) {
        this.allocationId = $.allocationId;
        this.allowReassociation = $.allowReassociation;
        this.instanceId = $.instanceId;
        this.networkInterfaceId = $.networkInterfaceId;
        this.privateIpAddress = $.privateIpAddress;
        this.publicIp = $.publicIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EipAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EipAssociationState $;

        public Builder() {
            $ = new EipAssociationState();
        }

        public Builder(EipAssociationState defaults) {
            $ = new EipAssociationState(Objects.requireNonNull(defaults));
        }

        public Builder allocationId(@Nullable Output<String> allocationId) {
            $.allocationId = allocationId;
            return this;
        }

        public Builder allocationId(String allocationId) {
            return allocationId(Output.of(allocationId));
        }

        public Builder allowReassociation(@Nullable Output<Boolean> allowReassociation) {
            $.allowReassociation = allowReassociation;
            return this;
        }

        public Builder allowReassociation(Boolean allowReassociation) {
            return allowReassociation(Output.of(allowReassociation));
        }

        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        public Builder publicIp(@Nullable Output<String> publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        public Builder publicIp(String publicIp) {
            return publicIp(Output.of(publicIp));
        }

        public EipAssociationState build() {
            return $;
        }
    }

}
