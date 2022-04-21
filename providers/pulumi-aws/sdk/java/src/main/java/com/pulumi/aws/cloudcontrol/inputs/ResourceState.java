// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudcontrol.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceState Empty = new ResourceState();

    @Import(name="desiredState")
    private @Nullable Output<String> desiredState;

    public Optional<Output<String>> desiredState() {
        return Optional.ofNullable(this.desiredState);
    }

    @Import(name="properties")
    private @Nullable Output<String> properties;

    public Optional<Output<String>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume for operations.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * JSON string of the CloudFormation resource type schema which is used for plan time validation where possible. Automatically fetched if not provided. In large scale environments with multiple resources using the same `type_name`, it is recommended to fetch the schema once via the `aws.cloudformation.CloudFormationType` data source and use this argument to reduce `DescribeType` API operation throttling. This value is marked sensitive only to prevent large plan differences from showing.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @Import(name="typeName")
    private @Nullable Output<String> typeName;

    public Optional<Output<String>> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    /**
     * Identifier of the CloudFormation resource type version.
     * 
     */
    @Import(name="typeVersionId")
    private @Nullable Output<String> typeVersionId;

    public Optional<Output<String>> typeVersionId() {
        return Optional.ofNullable(this.typeVersionId);
    }

    private ResourceState() {}

    private ResourceState(ResourceState $) {
        this.desiredState = $.desiredState;
        this.properties = $.properties;
        this.roleArn = $.roleArn;
        this.schema = $.schema;
        this.typeName = $.typeName;
        this.typeVersionId = $.typeVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceState $;

        public Builder() {
            $ = new ResourceState();
        }

        public Builder(ResourceState defaults) {
            $ = new ResourceState(Objects.requireNonNull(defaults));
        }

        public Builder desiredState(@Nullable Output<String> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        public Builder desiredState(String desiredState) {
            return desiredState(Output.of(desiredState));
        }

        public Builder properties(@Nullable Output<String> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(String properties) {
            return properties(Output.of(properties));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public Builder typeName(@Nullable Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        public Builder typeVersionId(@Nullable Output<String> typeVersionId) {
            $.typeVersionId = typeVersionId;
            return this;
        }

        public Builder typeVersionId(String typeVersionId) {
            return typeVersionId(Output.of(typeVersionId));
        }

        public ResourceState build() {
            return $;
        }
    }

}
