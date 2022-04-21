// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the configuration options available for the Amazon VPC CNI plugin for Kubernetes.
 * 
 */
public final class VpcCniOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcCniOptionsArgs Empty = new VpcCniOptionsArgs();

    /**
     * Specifies whether ipamd should configure rp filter for primary interface. Default is `false`.
     * 
     */
    @Import(name="cniConfigureRpfilter")
    private @Nullable Output<Boolean> cniConfigureRpfilter;

    public Optional<Output<Boolean>> cniConfigureRpfilter() {
        return Optional.ofNullable(this.cniConfigureRpfilter);
    }

    /**
     * Specifies that your pods may use subnets and security groups that are independent of your worker node&#39;s VPC configuration. By default, pods share the same subnet and security groups as the worker node&#39;s primary interface. Setting this variable to true causes ipamd to use the security groups and VPC subnet in a worker node&#39;s ENIConfig for elastic network interface allocation. You must create an ENIConfig custom resource for each subnet that your pods will reside in, and then annotate or label each worker node to use a specific ENIConfig (multiple worker nodes can be annotated or labelled with the same ENIConfig). Worker nodes can only be annotated with a single ENIConfig at a time, and the subnet in the ENIConfig must belong to the same Availability Zone that the worker node resides in. For more information, see CNI Custom Networking in the Amazon EKS User Guide. Default is `false`
     * 
     */
    @Import(name="cniCustomNetworkCfg")
    private @Nullable Output<Boolean> cniCustomNetworkCfg;

    public Optional<Output<Boolean>> cniCustomNetworkCfg() {
        return Optional.ofNullable(this.cniCustomNetworkCfg);
    }

    /**
     * Specifies whether an external NAT gateway should be used to provide SNAT of secondary ENI IP addresses. If set to true, the SNAT iptables rule and off-VPC IP rule are not applied, and these rules are removed if they have already been applied. Disable SNAT if you need to allow inbound communication to your pods from external VPNs, direct connections, and external VPCs, and your pods do not need to access the Internet directly via an Internet Gateway. However, your nodes must be running in a private subnet and connected to the internet through an AWS NAT Gateway or another external NAT device. Default is `false`
     * 
     */
    @Import(name="cniExternalSnat")
    private @Nullable Output<Boolean> cniExternalSnat;

    public Optional<Output<Boolean>> cniExternalSnat() {
        return Optional.ofNullable(this.cniExternalSnat);
    }

    /**
     * Specifies that your pods may use subnets and security groups (within the same VPC as your control plane resources) that are independent of your cluster&#39;s `resourcesVpcConfig`.
     * 
     * Defaults to false.
     * 
     */
    @Import(name="customNetworkConfig")
    private @Nullable Output<Boolean> customNetworkConfig;

    public Optional<Output<Boolean>> customNetworkConfig() {
        return Optional.ofNullable(this.customNetworkConfig);
    }

    /**
     * Allows the kubelet&#39;s liveness and readiness probes to connect via TCP when pod ENI is enabled. This will slightly increase local TCP connection latency.
     * 
     */
    @Import(name="disableTcpEarlyDemux")
    private @Nullable Output<Boolean> disableTcpEarlyDemux;

    public Optional<Output<Boolean>> disableTcpEarlyDemux() {
        return Optional.ofNullable(this.disableTcpEarlyDemux);
    }

    /**
     * Specifies whether to allow IPAMD to add the `vpc.amazonaws.com/has-trunk-attached` label to the node if the instance has capacity to attach an additional ENI. Default is `false`. If using liveness and readiness probes, you will also need to disable TCP early demux.
     * 
     */
    @Import(name="enablePodEni")
    private @Nullable Output<Boolean> enablePodEni;

    public Optional<Output<Boolean>> enablePodEni() {
        return Optional.ofNullable(this.enablePodEni);
    }

    /**
     * IPAMD will start allocating (/28) prefixes to the ENIs with ENABLE_PREFIX_DELEGATION set to true.
     * 
     */
    @Import(name="enablePrefixDelegation")
    private @Nullable Output<Boolean> enablePrefixDelegation;

    public Optional<Output<Boolean>> enablePrefixDelegation() {
        return Optional.ofNullable(this.enablePrefixDelegation);
    }

    /**
     * Specifies the ENI_CONFIG_LABEL_DEF environment variable value for worker nodes. This is used to tell Kubernetes to automatically apply the ENIConfig for each Availability Zone
     * Ref: https://docs.aws.amazon.com/eks/latest/userguide/cni-custom-network.html (step 5(c))
     * 
     * Defaults to the official AWS CNI image in ECR.
     * 
     */
    @Import(name="eniConfigLabelDef")
    private @Nullable Output<String> eniConfigLabelDef;

    public Optional<Output<String>> eniConfigLabelDef() {
        return Optional.ofNullable(this.eniConfigLabelDef);
    }

    /**
     * Used to configure the MTU size for attached ENIs. The valid range is from 576 to 9001.
     * 
     * Defaults to 9001.
     * 
     */
    @Import(name="eniMtu")
    private @Nullable Output<Integer> eniMtu;

    public Optional<Output<Integer>> eniMtu() {
        return Optional.ofNullable(this.eniMtu);
    }

    /**
     * Specifies whether an external NAT gateway should be used to provide SNAT of secondary ENI IP addresses. If set to true, the SNAT iptables rule and off-VPC IP rule are not applied, and these rules are removed if they have already been applied.
     * 
     * Defaults to false.
     * 
     */
    @Import(name="externalSnat")
    private @Nullable Output<Boolean> externalSnat;

    public Optional<Output<Boolean>> externalSnat() {
        return Optional.ofNullable(this.externalSnat);
    }

    /**
     * Specifies the container image to use in the AWS CNI cluster DaemonSet.
     * 
     * Defaults to the official AWS CNI image in ECR.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Specifies the init container image to use in the AWS CNI cluster DaemonSet.
     * 
     * Defaults to the official AWS CNI init container image in ECR.
     * 
     */
    @Import(name="initImage")
    private @Nullable Output<String> initImage;

    public Optional<Output<String>> initImage() {
        return Optional.ofNullable(this.initImage);
    }

    /**
     * Specifies the file path used for logs.
     * 
     * Defaults to &#34;stdout&#34; to emit Pod logs for `kubectl logs`.
     * 
     */
    @Import(name="logFile")
    private @Nullable Output<String> logFile;

    public Optional<Output<String>> logFile() {
        return Optional.ofNullable(this.logFile);
    }

    /**
     * Specifies the log level used for logs.
     * 
     * Defaults to &#34;DEBUG&#34;
     * Valid values: &#34;DEBUG&#34;, &#34;INFO&#34;, &#34;WARN&#34;, &#34;ERROR&#34;, or &#34;FATAL&#34;.
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * Specifies whether NodePort services are enabled on a worker node&#39;s primary network interface. This requires additional iptables rules and that the kernel&#39;s reverse path filter on the primary interface is set to loose.
     * 
     * Defaults to true.
     * 
     */
    @Import(name="nodePortSupport")
    private @Nullable Output<Boolean> nodePortSupport;

    public Optional<Output<Boolean>> nodePortSupport() {
        return Optional.ofNullable(this.nodePortSupport);
    }

    /**
     * Pass privilege to containers securityContext. This is required when SELinux is enabled. This value will not be passed to the CNI config by default
     * 
     */
    @Import(name="securityContextPrivileged")
    private @Nullable Output<Boolean> securityContextPrivileged;

    public Optional<Output<Boolean>> securityContextPrivileged() {
        return Optional.ofNullable(this.securityContextPrivileged);
    }

    /**
     * Specifies the veth prefix used to generate the host-side veth device name for the CNI.
     * 
     * The prefix can be at most 4 characters long.
     * 
     * Defaults to &#34;eni&#34;.
     * 
     */
    @Import(name="vethPrefix")
    private @Nullable Output<String> vethPrefix;

    public Optional<Output<String>> vethPrefix() {
        return Optional.ofNullable(this.vethPrefix);
    }

    /**
     * Specifies the number of free elastic network interfaces (and all of their available IP addresses) that the ipamD daemon should attempt to keep available for pod assignment on the node.
     * 
     * Defaults to 1.
     * 
     */
    @Import(name="warmEniTarget")
    private @Nullable Output<Integer> warmEniTarget;

    public Optional<Output<Integer>> warmEniTarget() {
        return Optional.ofNullable(this.warmEniTarget);
    }

    /**
     * Specifies the number of free IP addresses that the ipamD daemon should attempt to keep available for pod assignment on the node.
     * 
     */
    @Import(name="warmIpTarget")
    private @Nullable Output<Integer> warmIpTarget;

    public Optional<Output<Integer>> warmIpTarget() {
        return Optional.ofNullable(this.warmIpTarget);
    }

    /**
     * WARM_PREFIX_TARGET will allocate one full (/28) prefix even if a single IP  is consumed with the existing prefix. Ref: https://github.com/aws/amazon-vpc-cni-k8s/blob/master/docs/prefix-and-ip-target.md
     * 
     */
    @Import(name="warmPrefixTarget")
    private @Nullable Output<Integer> warmPrefixTarget;

    public Optional<Output<Integer>> warmPrefixTarget() {
        return Optional.ofNullable(this.warmPrefixTarget);
    }

    private VpcCniOptionsArgs() {}

    private VpcCniOptionsArgs(VpcCniOptionsArgs $) {
        this.cniConfigureRpfilter = $.cniConfigureRpfilter;
        this.cniCustomNetworkCfg = $.cniCustomNetworkCfg;
        this.cniExternalSnat = $.cniExternalSnat;
        this.customNetworkConfig = $.customNetworkConfig;
        this.disableTcpEarlyDemux = $.disableTcpEarlyDemux;
        this.enablePodEni = $.enablePodEni;
        this.enablePrefixDelegation = $.enablePrefixDelegation;
        this.eniConfigLabelDef = $.eniConfigLabelDef;
        this.eniMtu = $.eniMtu;
        this.externalSnat = $.externalSnat;
        this.image = $.image;
        this.initImage = $.initImage;
        this.logFile = $.logFile;
        this.logLevel = $.logLevel;
        this.nodePortSupport = $.nodePortSupport;
        this.securityContextPrivileged = $.securityContextPrivileged;
        this.vethPrefix = $.vethPrefix;
        this.warmEniTarget = $.warmEniTarget;
        this.warmIpTarget = $.warmIpTarget;
        this.warmPrefixTarget = $.warmPrefixTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcCniOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcCniOptionsArgs $;

        public Builder() {
            $ = new VpcCniOptionsArgs();
        }

        public Builder(VpcCniOptionsArgs defaults) {
            $ = new VpcCniOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder cniConfigureRpfilter(@Nullable Output<Boolean> cniConfigureRpfilter) {
            $.cniConfigureRpfilter = cniConfigureRpfilter;
            return this;
        }

        public Builder cniConfigureRpfilter(Boolean cniConfigureRpfilter) {
            return cniConfigureRpfilter(Output.of(cniConfigureRpfilter));
        }

        public Builder cniCustomNetworkCfg(@Nullable Output<Boolean> cniCustomNetworkCfg) {
            $.cniCustomNetworkCfg = cniCustomNetworkCfg;
            return this;
        }

        public Builder cniCustomNetworkCfg(Boolean cniCustomNetworkCfg) {
            return cniCustomNetworkCfg(Output.of(cniCustomNetworkCfg));
        }

        public Builder cniExternalSnat(@Nullable Output<Boolean> cniExternalSnat) {
            $.cniExternalSnat = cniExternalSnat;
            return this;
        }

        public Builder cniExternalSnat(Boolean cniExternalSnat) {
            return cniExternalSnat(Output.of(cniExternalSnat));
        }

        public Builder customNetworkConfig(@Nullable Output<Boolean> customNetworkConfig) {
            $.customNetworkConfig = customNetworkConfig;
            return this;
        }

        public Builder customNetworkConfig(Boolean customNetworkConfig) {
            return customNetworkConfig(Output.of(customNetworkConfig));
        }

        public Builder disableTcpEarlyDemux(@Nullable Output<Boolean> disableTcpEarlyDemux) {
            $.disableTcpEarlyDemux = disableTcpEarlyDemux;
            return this;
        }

        public Builder disableTcpEarlyDemux(Boolean disableTcpEarlyDemux) {
            return disableTcpEarlyDemux(Output.of(disableTcpEarlyDemux));
        }

        public Builder enablePodEni(@Nullable Output<Boolean> enablePodEni) {
            $.enablePodEni = enablePodEni;
            return this;
        }

        public Builder enablePodEni(Boolean enablePodEni) {
            return enablePodEni(Output.of(enablePodEni));
        }

        public Builder enablePrefixDelegation(@Nullable Output<Boolean> enablePrefixDelegation) {
            $.enablePrefixDelegation = enablePrefixDelegation;
            return this;
        }

        public Builder enablePrefixDelegation(Boolean enablePrefixDelegation) {
            return enablePrefixDelegation(Output.of(enablePrefixDelegation));
        }

        public Builder eniConfigLabelDef(@Nullable Output<String> eniConfigLabelDef) {
            $.eniConfigLabelDef = eniConfigLabelDef;
            return this;
        }

        public Builder eniConfigLabelDef(String eniConfigLabelDef) {
            return eniConfigLabelDef(Output.of(eniConfigLabelDef));
        }

        public Builder eniMtu(@Nullable Output<Integer> eniMtu) {
            $.eniMtu = eniMtu;
            return this;
        }

        public Builder eniMtu(Integer eniMtu) {
            return eniMtu(Output.of(eniMtu));
        }

        public Builder externalSnat(@Nullable Output<Boolean> externalSnat) {
            $.externalSnat = externalSnat;
            return this;
        }

        public Builder externalSnat(Boolean externalSnat) {
            return externalSnat(Output.of(externalSnat));
        }

        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder initImage(@Nullable Output<String> initImage) {
            $.initImage = initImage;
            return this;
        }

        public Builder initImage(String initImage) {
            return initImage(Output.of(initImage));
        }

        public Builder logFile(@Nullable Output<String> logFile) {
            $.logFile = logFile;
            return this;
        }

        public Builder logFile(String logFile) {
            return logFile(Output.of(logFile));
        }

        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        public Builder nodePortSupport(@Nullable Output<Boolean> nodePortSupport) {
            $.nodePortSupport = nodePortSupport;
            return this;
        }

        public Builder nodePortSupport(Boolean nodePortSupport) {
            return nodePortSupport(Output.of(nodePortSupport));
        }

        public Builder securityContextPrivileged(@Nullable Output<Boolean> securityContextPrivileged) {
            $.securityContextPrivileged = securityContextPrivileged;
            return this;
        }

        public Builder securityContextPrivileged(Boolean securityContextPrivileged) {
            return securityContextPrivileged(Output.of(securityContextPrivileged));
        }

        public Builder vethPrefix(@Nullable Output<String> vethPrefix) {
            $.vethPrefix = vethPrefix;
            return this;
        }

        public Builder vethPrefix(String vethPrefix) {
            return vethPrefix(Output.of(vethPrefix));
        }

        public Builder warmEniTarget(@Nullable Output<Integer> warmEniTarget) {
            $.warmEniTarget = warmEniTarget;
            return this;
        }

        public Builder warmEniTarget(Integer warmEniTarget) {
            return warmEniTarget(Output.of(warmEniTarget));
        }

        public Builder warmIpTarget(@Nullable Output<Integer> warmIpTarget) {
            $.warmIpTarget = warmIpTarget;
            return this;
        }

        public Builder warmIpTarget(Integer warmIpTarget) {
            return warmIpTarget(Output.of(warmIpTarget));
        }

        public Builder warmPrefixTarget(@Nullable Output<Integer> warmPrefixTarget) {
            $.warmPrefixTarget = warmPrefixTarget;
            return this;
        }

        public Builder warmPrefixTarget(Integer warmPrefixTarget) {
            return warmPrefixTarget(Output.of(warmPrefixTarget));
        }

        public VpcCniOptionsArgs build() {
            return $;
        }
    }

}
