// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1.inputs.StatefulSetPersistentVolumeClaimRetentionPolicyArgs;
import io.pulumi.kubernetes.apps_v1.inputs.StatefulSetUpdateStrategyArgs;
import io.pulumi.kubernetes.core_v1.inputs.PersistentVolumeClaimArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 * 
 */
public final class StatefulSetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulSetSpecArgs Empty = new StatefulSetSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.
     * 
     */
    @InputImport(name="minReadySeconds")
    private final @Nullable Input<Integer> minReadySeconds;

    public Input<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Input.empty() : this.minReadySeconds;
    }

    /**
     * persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
     * 
     */
    @InputImport(name="persistentVolumeClaimRetentionPolicy")
    private final @Nullable Input<StatefulSetPersistentVolumeClaimRetentionPolicyArgs> persistentVolumeClaimRetentionPolicy;

    public Input<StatefulSetPersistentVolumeClaimRetentionPolicyArgs> getPersistentVolumeClaimRetentionPolicy() {
        return this.persistentVolumeClaimRetentionPolicy == null ? Input.empty() : this.persistentVolumeClaimRetentionPolicy;
    }

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     * Possible enum values:
     *  - `"OrderedReady"` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
     *  - `"Parallel"` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
     * 
     */
    @InputImport(name="podManagementPolicy")
    private final @Nullable Input<String> podManagementPolicy;

    public Input<String> getPodManagementPolicy() {
        return this.podManagementPolicy == null ? Input.empty() : this.podManagementPolicy;
    }

    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    @InputImport(name="replicas")
    private final @Nullable Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    @InputImport(name="revisionHistoryLimit")
    private final @Nullable Input<Integer> revisionHistoryLimit;

    public Input<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Input.empty() : this.revisionHistoryLimit;
    }

    /**
     * selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @InputImport(name="selector", required=true)
    private final Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector;
    }

    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
     */
    @InputImport(name="template", required=true)
    private final Input<PodTemplateSpecArgs> template;

    public Input<PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    @InputImport(name="updateStrategy")
    private final @Nullable Input<StatefulSetUpdateStrategyArgs> updateStrategy;

    public Input<StatefulSetUpdateStrategyArgs> getUpdateStrategy() {
        return this.updateStrategy == null ? Input.empty() : this.updateStrategy;
    }

    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    @InputImport(name="volumeClaimTemplates")
    private final @Nullable Input<List<PersistentVolumeClaimArgs>> volumeClaimTemplates;

    public Input<List<PersistentVolumeClaimArgs>> getVolumeClaimTemplates() {
        return this.volumeClaimTemplates == null ? Input.empty() : this.volumeClaimTemplates;
    }

    public StatefulSetSpecArgs(
        @Nullable Input<Integer> minReadySeconds,
        @Nullable Input<StatefulSetPersistentVolumeClaimRetentionPolicyArgs> persistentVolumeClaimRetentionPolicy,
        @Nullable Input<String> podManagementPolicy,
        @Nullable Input<Integer> replicas,
        @Nullable Input<Integer> revisionHistoryLimit,
        Input<LabelSelectorArgs> selector,
        Input<String> serviceName,
        Input<PodTemplateSpecArgs> template,
        @Nullable Input<StatefulSetUpdateStrategyArgs> updateStrategy,
        @Nullable Input<List<PersistentVolumeClaimArgs>> volumeClaimTemplates) {
        this.minReadySeconds = minReadySeconds;
        this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
        this.podManagementPolicy = podManagementPolicy;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.updateStrategy = updateStrategy;
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    private StatefulSetSpecArgs() {
        this.minReadySeconds = Input.empty();
        this.persistentVolumeClaimRetentionPolicy = Input.empty();
        this.podManagementPolicy = Input.empty();
        this.replicas = Input.empty();
        this.revisionHistoryLimit = Input.empty();
        this.selector = Input.empty();
        this.serviceName = Input.empty();
        this.template = Input.empty();
        this.updateStrategy = Input.empty();
        this.volumeClaimTemplates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReadySeconds;
        private @Nullable Input<StatefulSetPersistentVolumeClaimRetentionPolicyArgs> persistentVolumeClaimRetentionPolicy;
        private @Nullable Input<String> podManagementPolicy;
        private @Nullable Input<Integer> replicas;
        private @Nullable Input<Integer> revisionHistoryLimit;
        private Input<LabelSelectorArgs> selector;
        private Input<String> serviceName;
        private Input<PodTemplateSpecArgs> template;
        private @Nullable Input<StatefulSetUpdateStrategyArgs> updateStrategy;
        private @Nullable Input<List<PersistentVolumeClaimArgs>> volumeClaimTemplates;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.persistentVolumeClaimRetentionPolicy = defaults.persistentVolumeClaimRetentionPolicy;
    	      this.podManagementPolicy = defaults.podManagementPolicy;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.serviceName = defaults.serviceName;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
    	      this.volumeClaimTemplates = defaults.volumeClaimTemplates;
        }

        public Builder setMinReadySeconds(@Nullable Input<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Input.ofNullable(minReadySeconds);
            return this;
        }

        public Builder setPersistentVolumeClaimRetentionPolicy(@Nullable Input<StatefulSetPersistentVolumeClaimRetentionPolicyArgs> persistentVolumeClaimRetentionPolicy) {
            this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
            return this;
        }

        public Builder setPersistentVolumeClaimRetentionPolicy(@Nullable StatefulSetPersistentVolumeClaimRetentionPolicyArgs persistentVolumeClaimRetentionPolicy) {
            this.persistentVolumeClaimRetentionPolicy = Input.ofNullable(persistentVolumeClaimRetentionPolicy);
            return this;
        }

        public Builder setPodManagementPolicy(@Nullable Input<String> podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }

        public Builder setPodManagementPolicy(@Nullable String podManagementPolicy) {
            this.podManagementPolicy = Input.ofNullable(podManagementPolicy);
            return this;
        }

        public Builder setReplicas(@Nullable Input<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = Input.ofNullable(replicas);
            return this;
        }

        public Builder setRevisionHistoryLimit(@Nullable Input<Integer> revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder setRevisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = Input.ofNullable(revisionHistoryLimit);
            return this;
        }

        public Builder setSelector(Input<LabelSelectorArgs> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setSelector(LabelSelectorArgs selector) {
            this.selector = Input.of(Objects.requireNonNull(selector));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setTemplate(Input<PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTemplate(PodTemplateSpecArgs template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public Builder setUpdateStrategy(@Nullable Input<StatefulSetUpdateStrategyArgs> updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        public Builder setUpdateStrategy(@Nullable StatefulSetUpdateStrategyArgs updateStrategy) {
            this.updateStrategy = Input.ofNullable(updateStrategy);
            return this;
        }

        public Builder setVolumeClaimTemplates(@Nullable Input<List<PersistentVolumeClaimArgs>> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }

        public Builder setVolumeClaimTemplates(@Nullable List<PersistentVolumeClaimArgs> volumeClaimTemplates) {
            this.volumeClaimTemplates = Input.ofNullable(volumeClaimTemplates);
            return this;
        }

        public StatefulSetSpecArgs build() {
            return new StatefulSetSpecArgs(minReadySeconds, persistentVolumeClaimRetentionPolicy, podManagementPolicy, replicas, revisionHistoryLimit, selector, serviceName, template, updateStrategy, volumeClaimTemplates);
        }
    }
}
