// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1alpha.inputs.AuditConfigArgs;
import com.pulumi.googlenative.metastore_v1alpha.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceDatabaseTableIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceDatabaseTableIamPolicyArgs Empty = new ServiceDatabaseTableIamPolicyArgs();

    /**
     * Specifies cloud audit logging configuration for this policy.
     * 
     */
    @Import(name="auditConfigs")
    private @Nullable Output<List<AuditConfigArgs>> auditConfigs;

    public Optional<Output<List<AuditConfigArgs>>> auditConfigs() {
        return Optional.ofNullable(this.auditConfigs);
    }

    /**
     * Associates a list of members, or principals, with a role. Optionally, may specify a condition that determines how and when the bindings are applied. Each of the bindings must contain at least one principal.The bindings in a Policy can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the bindings grant 50 different roles to user:alice@example.com, and not to any other principal, then you can add another 1,450 principals to the bindings in the Policy.
     * 
     */
    @Import(name="bindings")
    private @Nullable Output<List<BindingArgs>> bindings;

    public Optional<Output<List<BindingArgs>>> bindings() {
        return Optional.ofNullable(this.bindings);
    }

    @Import(name="databaseId", required=true)
    private Output<String> databaseId;

    public Output<String> databaseId() {
        return this.databaseId;
    }

    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the etag in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An etag is returned in the response to getIamPolicy, and systems are expected to put that etag in the request to setIamPolicy to ensure that their change will be applied to the same version of the policy.Important: If you use IAM Conditions, you must include the etag field whenever you call setIamPolicy. If you omit this field, then IAM allows you to overwrite a version 3 policy with a version 1 policy, and all of the conditions in the version 3 policy are lost.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    @Import(name="tableId", required=true)
    private Output<String> tableId;

    public Output<String> tableId() {
        return this.tableId;
    }

    /**
     * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only the fields in the mask will be modified. If no mask is provided, the following default mask is used:paths: &#34;bindings, etag&#34;
     * 
     */
    @Import(name="updateMask")
    private @Nullable Output<String> updateMask;

    public Optional<Output<String>> updateMask() {
        return Optional.ofNullable(this.updateMask);
    }

    /**
     * Specifies the format of the policy.Valid values are 0, 1, and 3. Requests that specify an invalid value are rejected.Any operation that affects conditional role bindings must specify version 3. This requirement applies to the following operations: Getting a policy that includes a conditional role binding Adding a conditional role binding to a policy Changing a conditional role binding in a policy Removing any role binding, with or without a condition, from a policy that includes conditionsImportant: If you use IAM Conditions, you must include the etag field whenever you call setIamPolicy. If you omit this field, then IAM allows you to overwrite a version 3 policy with a version 1 policy, and all of the conditions in the version 3 policy are lost.If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ServiceDatabaseTableIamPolicyArgs() {}

    private ServiceDatabaseTableIamPolicyArgs(ServiceDatabaseTableIamPolicyArgs $) {
        this.auditConfigs = $.auditConfigs;
        this.bindings = $.bindings;
        this.databaseId = $.databaseId;
        this.etag = $.etag;
        this.location = $.location;
        this.project = $.project;
        this.serviceId = $.serviceId;
        this.tableId = $.tableId;
        this.updateMask = $.updateMask;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceDatabaseTableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceDatabaseTableIamPolicyArgs $;

        public Builder() {
            $ = new ServiceDatabaseTableIamPolicyArgs();
        }

        public Builder(ServiceDatabaseTableIamPolicyArgs defaults) {
            $ = new ServiceDatabaseTableIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder auditConfigs(@Nullable Output<List<AuditConfigArgs>> auditConfigs) {
            $.auditConfigs = auditConfigs;
            return this;
        }

        public Builder auditConfigs(List<AuditConfigArgs> auditConfigs) {
            return auditConfigs(Output.of(auditConfigs));
        }

        public Builder auditConfigs(AuditConfigArgs... auditConfigs) {
            return auditConfigs(List.of(auditConfigs));
        }

        public Builder bindings(@Nullable Output<List<BindingArgs>> bindings) {
            $.bindings = bindings;
            return this;
        }

        public Builder bindings(List<BindingArgs> bindings) {
            return bindings(Output.of(bindings));
        }

        public Builder bindings(BindingArgs... bindings) {
            return bindings(List.of(bindings));
        }

        public Builder databaseId(Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public Builder tableId(Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        public Builder updateMask(@Nullable Output<String> updateMask) {
            $.updateMask = updateMask;
            return this;
        }

        public Builder updateMask(String updateMask) {
            return updateMask(Output.of(updateMask));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ServiceDatabaseTableIamPolicyArgs build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
