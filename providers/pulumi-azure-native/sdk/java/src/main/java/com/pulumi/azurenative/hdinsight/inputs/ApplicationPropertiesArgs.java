// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.ApplicationGetEndpointArgs;
import com.pulumi.azurenative.hdinsight.inputs.ApplicationGetHttpsEndpointArgs;
import com.pulumi.azurenative.hdinsight.inputs.ComputeProfileArgs;
import com.pulumi.azurenative.hdinsight.inputs.ErrorsArgs;
import com.pulumi.azurenative.hdinsight.inputs.RuntimeScriptActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The HDInsight cluster application GET response.
 * 
 */
public final class ApplicationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationPropertiesArgs Empty = new ApplicationPropertiesArgs();

    /**
     * The application type.
     * 
     */
    @Import(name="applicationType")
    private @Nullable Output<String> applicationType;

    /**
     * @return The application type.
     * 
     */
    public Optional<Output<String>> applicationType() {
        return Optional.ofNullable(this.applicationType);
    }

    /**
     * The list of roles in the cluster.
     * 
     */
    @Import(name="computeProfile")
    private @Nullable Output<ComputeProfileArgs> computeProfile;

    /**
     * @return The list of roles in the cluster.
     * 
     */
    public Optional<Output<ComputeProfileArgs>> computeProfile() {
        return Optional.ofNullable(this.computeProfile);
    }

    /**
     * The list of errors.
     * 
     */
    @Import(name="errors")
    private @Nullable Output<List<ErrorsArgs>> errors;

    /**
     * @return The list of errors.
     * 
     */
    public Optional<Output<List<ErrorsArgs>>> errors() {
        return Optional.ofNullable(this.errors);
    }

    /**
     * The list of application HTTPS endpoints.
     * 
     */
    @Import(name="httpsEndpoints")
    private @Nullable Output<List<ApplicationGetHttpsEndpointArgs>> httpsEndpoints;

    /**
     * @return The list of application HTTPS endpoints.
     * 
     */
    public Optional<Output<List<ApplicationGetHttpsEndpointArgs>>> httpsEndpoints() {
        return Optional.ofNullable(this.httpsEndpoints);
    }

    /**
     * The list of install script actions.
     * 
     */
    @Import(name="installScriptActions")
    private @Nullable Output<List<RuntimeScriptActionArgs>> installScriptActions;

    /**
     * @return The list of install script actions.
     * 
     */
    public Optional<Output<List<RuntimeScriptActionArgs>>> installScriptActions() {
        return Optional.ofNullable(this.installScriptActions);
    }

    /**
     * The list of application SSH endpoints.
     * 
     */
    @Import(name="sshEndpoints")
    private @Nullable Output<List<ApplicationGetEndpointArgs>> sshEndpoints;

    /**
     * @return The list of application SSH endpoints.
     * 
     */
    public Optional<Output<List<ApplicationGetEndpointArgs>>> sshEndpoints() {
        return Optional.ofNullable(this.sshEndpoints);
    }

    /**
     * The list of uninstall script actions.
     * 
     */
    @Import(name="uninstallScriptActions")
    private @Nullable Output<List<RuntimeScriptActionArgs>> uninstallScriptActions;

    /**
     * @return The list of uninstall script actions.
     * 
     */
    public Optional<Output<List<RuntimeScriptActionArgs>>> uninstallScriptActions() {
        return Optional.ofNullable(this.uninstallScriptActions);
    }

    private ApplicationPropertiesArgs() {}

    private ApplicationPropertiesArgs(ApplicationPropertiesArgs $) {
        this.applicationType = $.applicationType;
        this.computeProfile = $.computeProfile;
        this.errors = $.errors;
        this.httpsEndpoints = $.httpsEndpoints;
        this.installScriptActions = $.installScriptActions;
        this.sshEndpoints = $.sshEndpoints;
        this.uninstallScriptActions = $.uninstallScriptActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationPropertiesArgs $;

        public Builder() {
            $ = new ApplicationPropertiesArgs();
        }

        public Builder(ApplicationPropertiesArgs defaults) {
            $ = new ApplicationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationType The application type.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(@Nullable Output<String> applicationType) {
            $.applicationType = applicationType;
            return this;
        }

        /**
         * @param applicationType The application type.
         * 
         * @return builder
         * 
         */
        public Builder applicationType(String applicationType) {
            return applicationType(Output.of(applicationType));
        }

        /**
         * @param computeProfile The list of roles in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder computeProfile(@Nullable Output<ComputeProfileArgs> computeProfile) {
            $.computeProfile = computeProfile;
            return this;
        }

        /**
         * @param computeProfile The list of roles in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder computeProfile(ComputeProfileArgs computeProfile) {
            return computeProfile(Output.of(computeProfile));
        }

        /**
         * @param errors The list of errors.
         * 
         * @return builder
         * 
         */
        public Builder errors(@Nullable Output<List<ErrorsArgs>> errors) {
            $.errors = errors;
            return this;
        }

        /**
         * @param errors The list of errors.
         * 
         * @return builder
         * 
         */
        public Builder errors(List<ErrorsArgs> errors) {
            return errors(Output.of(errors));
        }

        /**
         * @param errors The list of errors.
         * 
         * @return builder
         * 
         */
        public Builder errors(ErrorsArgs... errors) {
            return errors(List.of(errors));
        }

        /**
         * @param httpsEndpoints The list of application HTTPS endpoints.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoints(@Nullable Output<List<ApplicationGetHttpsEndpointArgs>> httpsEndpoints) {
            $.httpsEndpoints = httpsEndpoints;
            return this;
        }

        /**
         * @param httpsEndpoints The list of application HTTPS endpoints.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoints(List<ApplicationGetHttpsEndpointArgs> httpsEndpoints) {
            return httpsEndpoints(Output.of(httpsEndpoints));
        }

        /**
         * @param httpsEndpoints The list of application HTTPS endpoints.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoints(ApplicationGetHttpsEndpointArgs... httpsEndpoints) {
            return httpsEndpoints(List.of(httpsEndpoints));
        }

        /**
         * @param installScriptActions The list of install script actions.
         * 
         * @return builder
         * 
         */
        public Builder installScriptActions(@Nullable Output<List<RuntimeScriptActionArgs>> installScriptActions) {
            $.installScriptActions = installScriptActions;
            return this;
        }

        /**
         * @param installScriptActions The list of install script actions.
         * 
         * @return builder
         * 
         */
        public Builder installScriptActions(List<RuntimeScriptActionArgs> installScriptActions) {
            return installScriptActions(Output.of(installScriptActions));
        }

        /**
         * @param installScriptActions The list of install script actions.
         * 
         * @return builder
         * 
         */
        public Builder installScriptActions(RuntimeScriptActionArgs... installScriptActions) {
            return installScriptActions(List.of(installScriptActions));
        }

        /**
         * @param sshEndpoints The list of application SSH endpoints.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoints(@Nullable Output<List<ApplicationGetEndpointArgs>> sshEndpoints) {
            $.sshEndpoints = sshEndpoints;
            return this;
        }

        /**
         * @param sshEndpoints The list of application SSH endpoints.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoints(List<ApplicationGetEndpointArgs> sshEndpoints) {
            return sshEndpoints(Output.of(sshEndpoints));
        }

        /**
         * @param sshEndpoints The list of application SSH endpoints.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoints(ApplicationGetEndpointArgs... sshEndpoints) {
            return sshEndpoints(List.of(sshEndpoints));
        }

        /**
         * @param uninstallScriptActions The list of uninstall script actions.
         * 
         * @return builder
         * 
         */
        public Builder uninstallScriptActions(@Nullable Output<List<RuntimeScriptActionArgs>> uninstallScriptActions) {
            $.uninstallScriptActions = uninstallScriptActions;
            return this;
        }

        /**
         * @param uninstallScriptActions The list of uninstall script actions.
         * 
         * @return builder
         * 
         */
        public Builder uninstallScriptActions(List<RuntimeScriptActionArgs> uninstallScriptActions) {
            return uninstallScriptActions(Output.of(uninstallScriptActions));
        }

        /**
         * @param uninstallScriptActions The list of uninstall script actions.
         * 
         * @return builder
         * 
         */
        public Builder uninstallScriptActions(RuntimeScriptActionArgs... uninstallScriptActions) {
            return uninstallScriptActions(List.of(uninstallScriptActions));
        }

        public ApplicationPropertiesArgs build() {
            return $;
        }
    }

}
