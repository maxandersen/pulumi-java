// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import com.pulumi.kubernetes.extensions_v1beta1.inputs.DaemonSetUpdateStrategyArgs;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DaemonSetSpec is the specification of a daemon set.
 * 
 */
public final class DaemonSetSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final DaemonSetSpecArgs Empty = new DaemonSetSpecArgs();

    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
     */
    @Import(name="minReadySeconds")
    private @Nullable Output<Integer> minReadySeconds;

    public Optional<Output<Integer>> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }

    /**
     * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
    private @Nullable Output<Integer> revisionHistoryLimit;

    public Optional<Output<Integer>> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }

    /**
     * A label query over pods that are managed by the daemon set. Must match in order to be controlled. If empty, defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorArgs> selector;

    public Optional<Output<LabelSelectorArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template&#39;s node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    @Import(name="template", required=true)
    private Output<PodTemplateSpecArgs> template;

    public Output<PodTemplateSpecArgs> template() {
        return this.template;
    }

    /**
     * DEPRECATED. A sequence number representing a specific generation of the template. Populated by the system. It can be set only during the creation.
     * 
     */
    @Import(name="templateGeneration")
    private @Nullable Output<Integer> templateGeneration;

    public Optional<Output<Integer>> templateGeneration() {
        return Optional.ofNullable(this.templateGeneration);
    }

    /**
     * An update strategy to replace existing DaemonSet pods with new pods.
     * 
     */
    @Import(name="updateStrategy")
    private @Nullable Output<DaemonSetUpdateStrategyArgs> updateStrategy;

    public Optional<Output<DaemonSetUpdateStrategyArgs>> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    private DaemonSetSpecArgs() {}

    private DaemonSetSpecArgs(DaemonSetSpecArgs $) {
        this.minReadySeconds = $.minReadySeconds;
        this.revisionHistoryLimit = $.revisionHistoryLimit;
        this.selector = $.selector;
        this.template = $.template;
        this.templateGeneration = $.templateGeneration;
        this.updateStrategy = $.updateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DaemonSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DaemonSetSpecArgs $;

        public Builder() {
            $ = new DaemonSetSpecArgs();
        }

        public Builder(DaemonSetSpecArgs defaults) {
            $ = new DaemonSetSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            $.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder minReadySeconds(Integer minReadySeconds) {
            return minReadySeconds(Output.of(minReadySeconds));
        }

        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            $.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            return revisionHistoryLimit(Output.of(revisionHistoryLimit));
        }

        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        public Builder template(Output<PodTemplateSpecArgs> template) {
            $.template = template;
            return this;
        }

        public Builder template(PodTemplateSpecArgs template) {
            return template(Output.of(template));
        }

        public Builder templateGeneration(@Nullable Output<Integer> templateGeneration) {
            $.templateGeneration = templateGeneration;
            return this;
        }

        public Builder templateGeneration(Integer templateGeneration) {
            return templateGeneration(Output.of(templateGeneration));
        }

        public Builder updateStrategy(@Nullable Output<DaemonSetUpdateStrategyArgs> updateStrategy) {
            $.updateStrategy = updateStrategy;
            return this;
        }

        public Builder updateStrategy(DaemonSetUpdateStrategyArgs updateStrategy) {
            return updateStrategy(Output.of(updateStrategy));
        }

        public DaemonSetSpecArgs build() {
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}
