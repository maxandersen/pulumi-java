// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.MessageFilterType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Edifact message filter for odata query.
 * 
 */
public final class EdifactMessageFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactMessageFilterArgs Empty = new EdifactMessageFilterArgs();

    /**
     * The message filter type.
     * 
     */
    @Import(name="messageFilterType", required=true)
    private Output<Either<String,MessageFilterType>> messageFilterType;

    public Output<Either<String,MessageFilterType>> messageFilterType() {
        return this.messageFilterType;
    }

    private EdifactMessageFilterArgs() {}

    private EdifactMessageFilterArgs(EdifactMessageFilterArgs $) {
        this.messageFilterType = $.messageFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactMessageFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactMessageFilterArgs $;

        public Builder() {
            $ = new EdifactMessageFilterArgs();
        }

        public Builder(EdifactMessageFilterArgs defaults) {
            $ = new EdifactMessageFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder messageFilterType(Output<Either<String,MessageFilterType>> messageFilterType) {
            $.messageFilterType = messageFilterType;
            return this;
        }

        public Builder messageFilterType(Either<String,MessageFilterType> messageFilterType) {
            return messageFilterType(Output.of(messageFilterType));
        }

        public EdifactMessageFilterArgs build() {
            $.messageFilterType = Objects.requireNonNull($.messageFilterType, "expected parameter 'messageFilterType' to be non-null");
            return $;
        }
    }

}
