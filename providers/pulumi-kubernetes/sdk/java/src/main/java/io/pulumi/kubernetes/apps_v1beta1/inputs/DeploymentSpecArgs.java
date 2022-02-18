// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1beta1.inputs.DeploymentStrategyArgs;
import io.pulumi.kubernetes.apps_v1beta1.inputs.RollbackConfigArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 * 
 */
public final class DeploymentSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecArgs Empty = new DeploymentSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @InputImport(name="minReadySeconds")
    private final @Nullable Input<Integer> minReadySeconds;

    public Input<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Input.empty() : this.minReadySeconds;
    }

    /**
     * Indicates that the deployment is paused.
     * 
     */
    @InputImport(name="paused")
    private final @Nullable Input<Boolean> paused;

    public Input<Boolean> getPaused() {
        return this.paused == null ? Input.empty() : this.paused;
    }

    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    @InputImport(name="progressDeadlineSeconds")
    private final @Nullable Input<Integer> progressDeadlineSeconds;

    public Input<Integer> getProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds == null ? Input.empty() : this.progressDeadlineSeconds;
    }

    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    @InputImport(name="replicas")
    private final @Nullable Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 2.
     * 
     */
    @InputImport(name="revisionHistoryLimit")
    private final @Nullable Input<Integer> revisionHistoryLimit;

    public Input<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Input.empty() : this.revisionHistoryLimit;
    }

    /**
     * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
     * 
     */
    @InputImport(name="rollbackTo")
    private final @Nullable Input<RollbackConfigArgs> rollbackTo;

    public Input<RollbackConfigArgs> getRollbackTo() {
        return this.rollbackTo == null ? Input.empty() : this.rollbackTo;
    }

    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
     * 
     */
    @InputImport(name="selector")
    private final @Nullable Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    @InputImport(name="strategy")
    private final @Nullable Input<DeploymentStrategyArgs> strategy;

    public Input<DeploymentStrategyArgs> getStrategy() {
        return this.strategy == null ? Input.empty() : this.strategy;
    }

    /**
     * Template describes the pods that will be created.
     * 
     */
    @InputImport(name="template", required=true)
    private final Input<PodTemplateSpecArgs> template;

    public Input<PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    public DeploymentSpecArgs(
        @Nullable Input<Integer> minReadySeconds,
        @Nullable Input<Boolean> paused,
        @Nullable Input<Integer> progressDeadlineSeconds,
        @Nullable Input<Integer> replicas,
        @Nullable Input<Integer> revisionHistoryLimit,
        @Nullable Input<RollbackConfigArgs> rollbackTo,
        @Nullable Input<LabelSelectorArgs> selector,
        @Nullable Input<DeploymentStrategyArgs> strategy,
        Input<PodTemplateSpecArgs> template) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.rollbackTo = rollbackTo;
        this.selector = selector;
        this.strategy = strategy;
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private DeploymentSpecArgs() {
        this.minReadySeconds = Input.empty();
        this.paused = Input.empty();
        this.progressDeadlineSeconds = Input.empty();
        this.replicas = Input.empty();
        this.revisionHistoryLimit = Input.empty();
        this.rollbackTo = Input.empty();
        this.selector = Input.empty();
        this.strategy = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReadySeconds;
        private @Nullable Input<Boolean> paused;
        private @Nullable Input<Integer> progressDeadlineSeconds;
        private @Nullable Input<Integer> replicas;
        private @Nullable Input<Integer> revisionHistoryLimit;
        private @Nullable Input<RollbackConfigArgs> rollbackTo;
        private @Nullable Input<LabelSelectorArgs> selector;
        private @Nullable Input<DeploymentStrategyArgs> strategy;
        private Input<PodTemplateSpecArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.paused = defaults.paused;
    	      this.progressDeadlineSeconds = defaults.progressDeadlineSeconds;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.rollbackTo = defaults.rollbackTo;
    	      this.selector = defaults.selector;
    	      this.strategy = defaults.strategy;
    	      this.template = defaults.template;
        }

        public Builder setMinReadySeconds(@Nullable Input<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Input.ofNullable(minReadySeconds);
            return this;
        }

        public Builder setPaused(@Nullable Input<Boolean> paused) {
            this.paused = paused;
            return this;
        }

        public Builder setPaused(@Nullable Boolean paused) {
            this.paused = Input.ofNullable(paused);
            return this;
        }

        public Builder setProgressDeadlineSeconds(@Nullable Input<Integer> progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }

        public Builder setProgressDeadlineSeconds(@Nullable Integer progressDeadlineSeconds) {
            this.progressDeadlineSeconds = Input.ofNullable(progressDeadlineSeconds);
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

        public Builder setRollbackTo(@Nullable Input<RollbackConfigArgs> rollbackTo) {
            this.rollbackTo = rollbackTo;
            return this;
        }

        public Builder setRollbackTo(@Nullable RollbackConfigArgs rollbackTo) {
            this.rollbackTo = Input.ofNullable(rollbackTo);
            return this;
        }

        public Builder setSelector(@Nullable Input<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable LabelSelectorArgs selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder setStrategy(@Nullable Input<DeploymentStrategyArgs> strategy) {
            this.strategy = strategy;
            return this;
        }

        public Builder setStrategy(@Nullable DeploymentStrategyArgs strategy) {
            this.strategy = Input.ofNullable(strategy);
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

        public DeploymentSpecArgs build() {
            return new DeploymentSpecArgs(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, rollbackTo, selector, strategy, template);
        }
    }
}
