// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final RoleAssignmentState Empty = new RoleAssignmentState();

    /**
     * The ID of the Principal (User, Group or Service Principal) to assign the Synapse Role Definition to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The ID of the Principal (User, Group or Service Principal) to assign the Synapse Role Definition to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Role Name of the Synapse Built-In Role. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return The Role Name of the Synapse Built-In Role. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    /**
     * The Synapse Spark Pool which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="synapseSparkPoolId")
    private @Nullable Output<String> synapseSparkPoolId;

    /**
     * @return The Synapse Spark Pool which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> synapseSparkPoolId() {
        return Optional.ofNullable(this.synapseSparkPoolId);
    }

    /**
     * The Synapse Workspace which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="synapseWorkspaceId")
    private @Nullable Output<String> synapseWorkspaceId;

    /**
     * @return The Synapse Workspace which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> synapseWorkspaceId() {
        return Optional.ofNullable(this.synapseWorkspaceId);
    }

    private RoleAssignmentState() {}

    private RoleAssignmentState(RoleAssignmentState $) {
        this.principalId = $.principalId;
        this.roleName = $.roleName;
        this.synapseSparkPoolId = $.synapseSparkPoolId;
        this.synapseWorkspaceId = $.synapseWorkspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleAssignmentState $;

        public Builder() {
            $ = new RoleAssignmentState();
        }

        public Builder(RoleAssignmentState defaults) {
            $ = new RoleAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The ID of the Principal (User, Group or Service Principal) to assign the Synapse Role Definition to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The ID of the Principal (User, Group or Service Principal) to assign the Synapse Role Definition to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param roleName The Role Name of the Synapse Built-In Role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The Role Name of the Synapse Built-In Role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param synapseSparkPoolId The Synapse Spark Pool which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseSparkPoolId(@Nullable Output<String> synapseSparkPoolId) {
            $.synapseSparkPoolId = synapseSparkPoolId;
            return this;
        }

        /**
         * @param synapseSparkPoolId The Synapse Spark Pool which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseSparkPoolId(String synapseSparkPoolId) {
            return synapseSparkPoolId(Output.of(synapseSparkPoolId));
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(@Nullable Output<String> synapseWorkspaceId) {
            $.synapseWorkspaceId = synapseWorkspaceId;
            return this;
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(String synapseWorkspaceId) {
            return synapseWorkspaceId(Output.of(synapseWorkspaceId));
        }

        public RoleAssignmentState build() {
            return $;
        }
    }

}
