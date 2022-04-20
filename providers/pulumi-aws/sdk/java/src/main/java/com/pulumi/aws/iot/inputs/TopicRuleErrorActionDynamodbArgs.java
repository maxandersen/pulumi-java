// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionDynamodbArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionDynamodbArgs Empty = new TopicRuleErrorActionDynamodbArgs();

    /**
     * The hash key name.
     * 
     */
    @Import(name="hashKeyField", required=true)
      private final Output<String> hashKeyField;

    public Output<String> hashKeyField() {
        return this.hashKeyField;
    }

    /**
     * The hash key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    @Import(name="hashKeyType")
      private final @Nullable Output<String> hashKeyType;

    public Output<String> hashKeyType() {
        return this.hashKeyType == null ? Codegen.empty() : this.hashKeyType;
    }

    /**
     * The hash key value.
     * 
     */
    @Import(name="hashKeyValue", required=true)
      private final Output<String> hashKeyValue;

    public Output<String> hashKeyValue() {
        return this.hashKeyValue;
    }

    /**
     * The operation. Valid values are &#34;INSERT&#34;, &#34;UPDATE&#34;, or &#34;DELETE&#34;.
     * 
     */
    @Import(name="operation")
      private final @Nullable Output<String> operation;

    public Output<String> operation() {
        return this.operation == null ? Codegen.empty() : this.operation;
    }

    /**
     * The action payload.
     * 
     */
    @Import(name="payloadField")
      private final @Nullable Output<String> payloadField;

    public Output<String> payloadField() {
        return this.payloadField == null ? Codegen.empty() : this.payloadField;
    }

    /**
     * The range key name.
     * 
     */
    @Import(name="rangeKeyField")
      private final @Nullable Output<String> rangeKeyField;

    public Output<String> rangeKeyField() {
        return this.rangeKeyField == null ? Codegen.empty() : this.rangeKeyField;
    }

    /**
     * The range key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    @Import(name="rangeKeyType")
      private final @Nullable Output<String> rangeKeyType;

    public Output<String> rangeKeyType() {
        return this.rangeKeyType == null ? Codegen.empty() : this.rangeKeyType;
    }

    /**
     * The range key value.
     * 
     */
    @Import(name="rangeKeyValue")
      private final @Nullable Output<String> rangeKeyValue;

    public Output<String> rangeKeyValue() {
        return this.rangeKeyValue == null ? Codegen.empty() : this.rangeKeyValue;
    }

    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName;
    }

    public TopicRuleErrorActionDynamodbArgs(
        Output<String> hashKeyField,
        @Nullable Output<String> hashKeyType,
        Output<String> hashKeyValue,
        @Nullable Output<String> operation,
        @Nullable Output<String> payloadField,
        @Nullable Output<String> rangeKeyField,
        @Nullable Output<String> rangeKeyType,
        @Nullable Output<String> rangeKeyValue,
        Output<String> roleArn,
        Output<String> tableName) {
        this.hashKeyField = Objects.requireNonNull(hashKeyField, "expected parameter 'hashKeyField' to be non-null");
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = Objects.requireNonNull(hashKeyValue, "expected parameter 'hashKeyValue' to be non-null");
        this.operation = operation;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private TopicRuleErrorActionDynamodbArgs() {
        this.hashKeyField = Codegen.empty();
        this.hashKeyType = Codegen.empty();
        this.hashKeyValue = Codegen.empty();
        this.operation = Codegen.empty();
        this.payloadField = Codegen.empty();
        this.rangeKeyField = Codegen.empty();
        this.rangeKeyType = Codegen.empty();
        this.rangeKeyValue = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionDynamodbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> hashKeyField;
        private @Nullable Output<String> hashKeyType;
        private Output<String> hashKeyValue;
        private @Nullable Output<String> operation;
        private @Nullable Output<String> payloadField;
        private @Nullable Output<String> rangeKeyField;
        private @Nullable Output<String> rangeKeyType;
        private @Nullable Output<String> rangeKeyValue;
        private Output<String> roleArn;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionDynamodbArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
        }

        public Builder hashKeyField(Output<String> hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }
        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Output.of(Objects.requireNonNull(hashKeyField));
            return this;
        }
        public Builder hashKeyType(@Nullable Output<String> hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }
        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = Codegen.ofNullable(hashKeyType);
            return this;
        }
        public Builder hashKeyValue(Output<String> hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }
        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Output.of(Objects.requireNonNull(hashKeyValue));
            return this;
        }
        public Builder operation(@Nullable Output<String> operation) {
            this.operation = operation;
            return this;
        }
        public Builder operation(@Nullable String operation) {
            this.operation = Codegen.ofNullable(operation);
            return this;
        }
        public Builder payloadField(@Nullable Output<String> payloadField) {
            this.payloadField = payloadField;
            return this;
        }
        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = Codegen.ofNullable(payloadField);
            return this;
        }
        public Builder rangeKeyField(@Nullable Output<String> rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }
        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = Codegen.ofNullable(rangeKeyField);
            return this;
        }
        public Builder rangeKeyType(@Nullable Output<String> rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }
        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = Codegen.ofNullable(rangeKeyType);
            return this;
        }
        public Builder rangeKeyValue(@Nullable Output<String> rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }
        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = Codegen.ofNullable(rangeKeyValue);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }        public TopicRuleErrorActionDynamodbArgs build() {
            return new TopicRuleErrorActionDynamodbArgs(hashKeyField, hashKeyType, hashKeyValue, operation, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, roleArn, tableName);
        }
    }
}
