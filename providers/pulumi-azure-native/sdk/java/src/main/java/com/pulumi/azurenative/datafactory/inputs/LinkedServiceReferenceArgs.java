// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Linked service reference type.
 * 
 */
public final class LinkedServiceReferenceArgs extends ResourceArgs {

    public static final LinkedServiceReferenceArgs Empty = new LinkedServiceReferenceArgs();

    /**
     * Arguments for LinkedService.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return Arguments for LinkedService.
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Reference LinkedService name.
     * 
     */
    @Import(name="referenceName", required=true)
    private Output<String> referenceName;

    /**
     * @return Reference LinkedService name.
     * 
     */
    public Output<String> referenceName() {
        return this.referenceName;
    }

    /**
     * Linked service reference type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Linked service reference type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private LinkedServiceReferenceArgs() {}

    private LinkedServiceReferenceArgs(LinkedServiceReferenceArgs $) {
        this.parameters = $.parameters;
        this.referenceName = $.referenceName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceReferenceArgs $;

        public Builder() {
            $ = new LinkedServiceReferenceArgs();
        }

        public Builder(LinkedServiceReferenceArgs defaults) {
            $ = new LinkedServiceReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameters Arguments for LinkedService.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Arguments for LinkedService.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param referenceName Reference LinkedService name.
         * 
         * @return builder
         * 
         */
        public Builder referenceName(Output<String> referenceName) {
            $.referenceName = referenceName;
            return this;
        }

        /**
         * @param referenceName Reference LinkedService name.
         * 
         * @return builder
         * 
         */
        public Builder referenceName(String referenceName) {
            return referenceName(Output.of(referenceName));
        }

        /**
         * @param type Linked service reference type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Linked service reference type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LinkedServiceReferenceArgs build() {
            $.referenceName = Objects.requireNonNull($.referenceName, "expected parameter 'referenceName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
