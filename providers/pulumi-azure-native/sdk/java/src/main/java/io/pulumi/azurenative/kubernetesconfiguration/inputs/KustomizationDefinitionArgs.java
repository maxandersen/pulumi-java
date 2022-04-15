// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.enums.KustomizationValidationType;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.DependsOnDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Kustomization defining how to reconcile the artifact pulled by the source type on the cluster.
 * 
 */
public final class KustomizationDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final KustomizationDefinitionArgs Empty = new KustomizationDefinitionArgs();

    /**
     * Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<DependsOnDefinitionArgs>> dependsOn;

    public Output<List<DependsOnDefinitionArgs>> dependsOn() {
        return this.dependsOn == null ? Codegen.empty() : this.dependsOn;
    }

    /**
     * Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
     * 
     */
    @Import(name="force")
      private final @Nullable Output<Boolean> force;

    public Output<Boolean> force() {
        return this.force == null ? Codegen.empty() : this.force;
    }

    /**
     * The path in the source reference to reconcile on the cluster.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     */
    @Import(name="prune")
      private final @Nullable Output<Boolean> prune;

    public Output<Boolean> prune() {
        return this.prune == null ? Codegen.empty() : this.prune;
    }

    /**
     * The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     * 
     */
    @Import(name="retryIntervalInSeconds")
      private final @Nullable Output<Double> retryIntervalInSeconds;

    public Output<Double> retryIntervalInSeconds() {
        return this.retryIntervalInSeconds == null ? Codegen.empty() : this.retryIntervalInSeconds;
    }

    /**
     * The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     */
    @Import(name="syncIntervalInSeconds")
      private final @Nullable Output<Double> syncIntervalInSeconds;

    public Output<Double> syncIntervalInSeconds() {
        return this.syncIntervalInSeconds == null ? Codegen.empty() : this.syncIntervalInSeconds;
    }

    /**
     * The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     */
    @Import(name="timeoutInSeconds")
      private final @Nullable Output<Double> timeoutInSeconds;

    public Output<Double> timeoutInSeconds() {
        return this.timeoutInSeconds == null ? Codegen.empty() : this.timeoutInSeconds;
    }

    /**
     * Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
     * 
     */
    @Import(name="validation")
      private final @Nullable Output<Either<String,KustomizationValidationType>> validation;

    public Output<Either<String,KustomizationValidationType>> validation() {
        return this.validation == null ? Codegen.empty() : this.validation;
    }

    public KustomizationDefinitionArgs(
        @Nullable Output<List<DependsOnDefinitionArgs>> dependsOn,
        @Nullable Output<Boolean> force,
        @Nullable Output<String> path,
        @Nullable Output<Boolean> prune,
        @Nullable Output<Double> retryIntervalInSeconds,
        @Nullable Output<Double> syncIntervalInSeconds,
        @Nullable Output<Double> timeoutInSeconds,
        @Nullable Output<Either<String,KustomizationValidationType>> validation) {
        this.dependsOn = dependsOn;
        this.force = force == null ? Codegen.ofNullable(false) : force;
        this.path = path == null ? Codegen.ofNullable("") : path;
        this.prune = prune == null ? Codegen.ofNullable(false) : prune;
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        this.syncIntervalInSeconds = syncIntervalInSeconds == null ? Codegen.ofNullable(6e+02) : syncIntervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds == null ? Codegen.ofNullable(6e+02) : timeoutInSeconds;
        this.validation = validation;
    }

    private KustomizationDefinitionArgs() {
        this.dependsOn = Codegen.empty();
        this.force = Codegen.empty();
        this.path = Codegen.empty();
        this.prune = Codegen.empty();
        this.retryIntervalInSeconds = Codegen.empty();
        this.syncIntervalInSeconds = Codegen.empty();
        this.timeoutInSeconds = Codegen.empty();
        this.validation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KustomizationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DependsOnDefinitionArgs>> dependsOn;
        private @Nullable Output<Boolean> force;
        private @Nullable Output<String> path;
        private @Nullable Output<Boolean> prune;
        private @Nullable Output<Double> retryIntervalInSeconds;
        private @Nullable Output<Double> syncIntervalInSeconds;
        private @Nullable Output<Double> timeoutInSeconds;
        private @Nullable Output<Either<String,KustomizationValidationType>> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(KustomizationDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.force = defaults.force;
    	      this.path = defaults.path;
    	      this.prune = defaults.prune;
    	      this.retryIntervalInSeconds = defaults.retryIntervalInSeconds;
    	      this.syncIntervalInSeconds = defaults.syncIntervalInSeconds;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.validation = defaults.validation;
        }

        public Builder dependsOn(@Nullable Output<List<DependsOnDefinitionArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<DependsOnDefinitionArgs> dependsOn) {
            this.dependsOn = Codegen.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(DependsOnDefinitionArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder force(@Nullable Output<Boolean> force) {
            this.force = force;
            return this;
        }
        public Builder force(@Nullable Boolean force) {
            this.force = Codegen.ofNullable(force);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder prune(@Nullable Output<Boolean> prune) {
            this.prune = prune;
            return this;
        }
        public Builder prune(@Nullable Boolean prune) {
            this.prune = Codegen.ofNullable(prune);
            return this;
        }
        public Builder retryIntervalInSeconds(@Nullable Output<Double> retryIntervalInSeconds) {
            this.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }
        public Builder retryIntervalInSeconds(@Nullable Double retryIntervalInSeconds) {
            this.retryIntervalInSeconds = Codegen.ofNullable(retryIntervalInSeconds);
            return this;
        }
        public Builder syncIntervalInSeconds(@Nullable Output<Double> syncIntervalInSeconds) {
            this.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }
        public Builder syncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            this.syncIntervalInSeconds = Codegen.ofNullable(syncIntervalInSeconds);
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Output<Double> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = Codegen.ofNullable(timeoutInSeconds);
            return this;
        }
        public Builder validation(@Nullable Output<Either<String,KustomizationValidationType>> validation) {
            this.validation = validation;
            return this;
        }
        public Builder validation(@Nullable Either<String,KustomizationValidationType> validation) {
            this.validation = Codegen.ofNullable(validation);
            return this;
        }        public KustomizationDefinitionArgs build() {
            return new KustomizationDefinitionArgs(dependsOn, force, path, prune, retryIntervalInSeconds, syncIntervalInSeconds, timeoutInSeconds, validation);
        }
    }
}
