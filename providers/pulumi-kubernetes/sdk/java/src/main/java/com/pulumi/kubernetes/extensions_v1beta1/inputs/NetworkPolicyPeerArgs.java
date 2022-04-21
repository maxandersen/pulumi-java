// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.extensions_v1beta1.inputs.IPBlockArgs;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by networking/v1/NetworkPolicyPeer.
 * 
 */
public final class NetworkPolicyPeerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPeerArgs Empty = new NetworkPolicyPeerArgs();

    /**
     * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
     */
    @Import(name="ipBlock")
    private @Nullable Output<IPBlockArgs> ipBlock;

    public Optional<Output<IPBlockArgs>> ipBlock() {
        return Optional.ofNullable(this.ipBlock);
    }

    /**
     * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * 
     */
    @Import(name="namespaceSelector")
    private @Nullable Output<LabelSelectorArgs> namespaceSelector;

    public Optional<Output<LabelSelectorArgs>> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }

    /**
     * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy&#39;s own Namespace.
     * 
     */
    @Import(name="podSelector")
    private @Nullable Output<LabelSelectorArgs> podSelector;

    public Optional<Output<LabelSelectorArgs>> podSelector() {
        return Optional.ofNullable(this.podSelector);
    }

    private NetworkPolicyPeerArgs() {}

    private NetworkPolicyPeerArgs(NetworkPolicyPeerArgs $) {
        this.ipBlock = $.ipBlock;
        this.namespaceSelector = $.namespaceSelector;
        this.podSelector = $.podSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyPeerArgs $;

        public Builder() {
            $ = new NetworkPolicyPeerArgs();
        }

        public Builder(NetworkPolicyPeerArgs defaults) {
            $ = new NetworkPolicyPeerArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipBlock(@Nullable Output<IPBlockArgs> ipBlock) {
            $.ipBlock = ipBlock;
            return this;
        }

        public Builder ipBlock(IPBlockArgs ipBlock) {
            return ipBlock(Output.of(ipBlock));
        }

        public Builder namespaceSelector(@Nullable Output<LabelSelectorArgs> namespaceSelector) {
            $.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder namespaceSelector(LabelSelectorArgs namespaceSelector) {
            return namespaceSelector(Output.of(namespaceSelector));
        }

        public Builder podSelector(@Nullable Output<LabelSelectorArgs> podSelector) {
            $.podSelector = podSelector;
            return this;
        }

        public Builder podSelector(LabelSelectorArgs podSelector) {
            return podSelector(Output.of(podSelector));
        }

        public NetworkPolicyPeerArgs build() {
            return $;
        }
    }

}
