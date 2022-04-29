// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.azurenative.kubernetesconfiguration.enums.KustomizationValidationType;
import com.pulumi.azurenative.kubernetesconfiguration.inputs.DependsOnDefinitionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Kustomization defining how to reconcile the artifact pulled by the source type on the cluster.
 * 
 */
public final class KustomizationDefinitionArgs extends ResourceArgs {

    public static final KustomizationDefinitionArgs Empty = new KustomizationDefinitionArgs();

    /**
     * Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<DependsOnDefinitionArgs>> dependsOn;

    /**
     * @return Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
     * 
     */
    public Optional<Output<List<DependsOnDefinitionArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The path in the source reference to reconcile on the cluster.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path in the source reference to reconcile on the cluster.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     */
    @Import(name="prune")
    private @Nullable Output<Boolean> prune;

    /**
     * @return Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     */
    public Optional<Output<Boolean>> prune() {
        return Optional.ofNullable(this.prune);
    }

    /**
     * The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     * 
     */
    @Import(name="retryIntervalInSeconds")
    private @Nullable Output<Double> retryIntervalInSeconds;

    /**
     * @return The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     * 
     */
    public Optional<Output<Double>> retryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }

    /**
     * The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     */
    @Import(name="syncIntervalInSeconds")
    private @Nullable Output<Double> syncIntervalInSeconds;

    /**
     * @return The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     */
    public Optional<Output<Double>> syncIntervalInSeconds() {
        return Optional.ofNullable(this.syncIntervalInSeconds);
    }

    /**
     * The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     */
    @Import(name="timeoutInSeconds")
    private @Nullable Output<Double> timeoutInSeconds;

    /**
     * @return The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     */
    public Optional<Output<Double>> timeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    /**
     * Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
     * 
     */
    @Import(name="validation")
    private @Nullable Output<Either<String,KustomizationValidationType>> validation;

    /**
     * @return Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
     * 
     */
    public Optional<Output<Either<String,KustomizationValidationType>>> validation() {
        return Optional.ofNullable(this.validation);
    }

    private KustomizationDefinitionArgs() {}

    private KustomizationDefinitionArgs(KustomizationDefinitionArgs $) {
        this.dependsOn = $.dependsOn;
        this.force = $.force;
        this.path = $.path;
        this.prune = $.prune;
        this.retryIntervalInSeconds = $.retryIntervalInSeconds;
        this.syncIntervalInSeconds = $.syncIntervalInSeconds;
        this.timeoutInSeconds = $.timeoutInSeconds;
        this.validation = $.validation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KustomizationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KustomizationDefinitionArgs $;

        public Builder() {
            $ = new KustomizationDefinitionArgs();
        }

        public Builder(KustomizationDefinitionArgs defaults) {
            $ = new KustomizationDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dependsOn Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<DependsOnDefinitionArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<DependsOnDefinitionArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(DependsOnDefinitionArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param force Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param path The path in the source reference to reconcile on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path in the source reference to reconcile on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param prune Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
         * 
         * @return builder
         * 
         */
        public Builder prune(@Nullable Output<Boolean> prune) {
            $.prune = prune;
            return this;
        }

        /**
         * @param prune Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
         * 
         * @return builder
         * 
         */
        public Builder prune(Boolean prune) {
            return prune(Output.of(prune));
        }

        /**
         * @param retryIntervalInSeconds The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder retryIntervalInSeconds(@Nullable Output<Double> retryIntervalInSeconds) {
            $.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        /**
         * @param retryIntervalInSeconds The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder retryIntervalInSeconds(Double retryIntervalInSeconds) {
            return retryIntervalInSeconds(Output.of(retryIntervalInSeconds));
        }

        /**
         * @param syncIntervalInSeconds The interval at which to re-reconcile the Kustomization on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder syncIntervalInSeconds(@Nullable Output<Double> syncIntervalInSeconds) {
            $.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        /**
         * @param syncIntervalInSeconds The interval at which to re-reconcile the Kustomization on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder syncIntervalInSeconds(Double syncIntervalInSeconds) {
            return syncIntervalInSeconds(Output.of(syncIntervalInSeconds));
        }

        /**
         * @param timeoutInSeconds The maximum time to attempt to reconcile the Kustomization on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(@Nullable Output<Double> timeoutInSeconds) {
            $.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /**
         * @param timeoutInSeconds The maximum time to attempt to reconcile the Kustomization on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(Double timeoutInSeconds) {
            return timeoutInSeconds(Output.of(timeoutInSeconds));
        }

        /**
         * @param validation Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder validation(@Nullable Output<Either<String,KustomizationValidationType>> validation) {
            $.validation = validation;
            return this;
        }

        /**
         * @param validation Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder validation(Either<String,KustomizationValidationType> validation) {
            return validation(Output.of(validation));
        }

        /**
         * @param validation Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder validation(String validation) {
            return validation(Either.ofLeft(validation));
        }

        /**
         * @param validation Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder validation(KustomizationValidationType validation) {
            return validation(Either.ofRight(validation));
        }

        public KustomizationDefinitionArgs build() {
            $.force = Codegen.booleanProp("force").output().arg($.force).def(false).getNullable();
            $.path = Codegen.stringProp("path").output().arg($.path).def("").getNullable();
            $.prune = Codegen.booleanProp("prune").output().arg($.prune).def(false).getNullable();
            $.syncIntervalInSeconds = Codegen.doubleProp("syncIntervalInSeconds").output().arg($.syncIntervalInSeconds).def(6e+02).getNullable();
            $.timeoutInSeconds = Codegen.doubleProp("timeoutInSeconds").output().arg($.timeoutInSeconds).def(6e+02).getNullable();
            return $;
        }
    }

}
