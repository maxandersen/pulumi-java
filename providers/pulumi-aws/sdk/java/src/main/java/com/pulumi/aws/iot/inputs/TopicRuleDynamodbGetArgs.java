// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleDynamodbGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleDynamodbGetArgs Empty = new TopicRuleDynamodbGetArgs();

    /**
     * The hash key name.
     * 
     */
    @Import(name="hashKeyField", required=true)
    private Output<String> hashKeyField;

    public Output<String> hashKeyField() {
        return this.hashKeyField;
    }

    /**
     * The hash key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    @Import(name="hashKeyType")
    private @Nullable Output<String> hashKeyType;

    public Optional<Output<String>> hashKeyType() {
        return Optional.ofNullable(this.hashKeyType);
    }

    /**
     * The hash key value.
     * 
     */
    @Import(name="hashKeyValue", required=true)
    private Output<String> hashKeyValue;

    public Output<String> hashKeyValue() {
        return this.hashKeyValue;
    }

    /**
     * The operation. Valid values are &#34;INSERT&#34;, &#34;UPDATE&#34;, or &#34;DELETE&#34;.
     * 
     */
    @Import(name="operation")
    private @Nullable Output<String> operation;

    public Optional<Output<String>> operation() {
        return Optional.ofNullable(this.operation);
    }

    /**
     * The action payload.
     * 
     */
    @Import(name="payloadField")
    private @Nullable Output<String> payloadField;

    public Optional<Output<String>> payloadField() {
        return Optional.ofNullable(this.payloadField);
    }

    /**
     * The range key name.
     * 
     */
    @Import(name="rangeKeyField")
    private @Nullable Output<String> rangeKeyField;

    public Optional<Output<String>> rangeKeyField() {
        return Optional.ofNullable(this.rangeKeyField);
    }

    /**
     * The range key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    @Import(name="rangeKeyType")
    private @Nullable Output<String> rangeKeyType;

    public Optional<Output<String>> rangeKeyType() {
        return Optional.ofNullable(this.rangeKeyType);
    }

    /**
     * The range key value.
     * 
     */
    @Import(name="rangeKeyValue")
    private @Nullable Output<String> rangeKeyValue;

    public Optional<Output<String>> rangeKeyValue() {
        return Optional.ofNullable(this.rangeKeyValue);
    }

    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName;
    }

    private TopicRuleDynamodbGetArgs() {}

    private TopicRuleDynamodbGetArgs(TopicRuleDynamodbGetArgs $) {
        this.hashKeyField = $.hashKeyField;
        this.hashKeyType = $.hashKeyType;
        this.hashKeyValue = $.hashKeyValue;
        this.operation = $.operation;
        this.payloadField = $.payloadField;
        this.rangeKeyField = $.rangeKeyField;
        this.rangeKeyType = $.rangeKeyType;
        this.rangeKeyValue = $.rangeKeyValue;
        this.roleArn = $.roleArn;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleDynamodbGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleDynamodbGetArgs $;

        public Builder() {
            $ = new TopicRuleDynamodbGetArgs();
        }

        public Builder(TopicRuleDynamodbGetArgs defaults) {
            $ = new TopicRuleDynamodbGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder hashKeyField(Output<String> hashKeyField) {
            $.hashKeyField = hashKeyField;
            return this;
        }

        public Builder hashKeyField(String hashKeyField) {
            return hashKeyField(Output.of(hashKeyField));
        }

        public Builder hashKeyType(@Nullable Output<String> hashKeyType) {
            $.hashKeyType = hashKeyType;
            return this;
        }

        public Builder hashKeyType(String hashKeyType) {
            return hashKeyType(Output.of(hashKeyType));
        }

        public Builder hashKeyValue(Output<String> hashKeyValue) {
            $.hashKeyValue = hashKeyValue;
            return this;
        }

        public Builder hashKeyValue(String hashKeyValue) {
            return hashKeyValue(Output.of(hashKeyValue));
        }

        public Builder operation(@Nullable Output<String> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        public Builder payloadField(@Nullable Output<String> payloadField) {
            $.payloadField = payloadField;
            return this;
        }

        public Builder payloadField(String payloadField) {
            return payloadField(Output.of(payloadField));
        }

        public Builder rangeKeyField(@Nullable Output<String> rangeKeyField) {
            $.rangeKeyField = rangeKeyField;
            return this;
        }

        public Builder rangeKeyField(String rangeKeyField) {
            return rangeKeyField(Output.of(rangeKeyField));
        }

        public Builder rangeKeyType(@Nullable Output<String> rangeKeyType) {
            $.rangeKeyType = rangeKeyType;
            return this;
        }

        public Builder rangeKeyType(String rangeKeyType) {
            return rangeKeyType(Output.of(rangeKeyType));
        }

        public Builder rangeKeyValue(@Nullable Output<String> rangeKeyValue) {
            $.rangeKeyValue = rangeKeyValue;
            return this;
        }

        public Builder rangeKeyValue(String rangeKeyValue) {
            return rangeKeyValue(Output.of(rangeKeyValue));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public TopicRuleDynamodbGetArgs build() {
            $.hashKeyField = Objects.requireNonNull($.hashKeyField, "expected parameter 'hashKeyField' to be non-null");
            $.hashKeyValue = Objects.requireNonNull($.hashKeyValue, "expected parameter 'hashKeyValue' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
