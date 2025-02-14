// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.speech_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An item of the class.
 * 
 */
public final class ClassItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassItemArgs Empty = new ClassItemArgs();

    /**
     * The class item&#39;s value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The class item&#39;s value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ClassItemArgs() {}

    private ClassItemArgs(ClassItemArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassItemArgs $;

        public Builder() {
            $ = new ClassItemArgs();
        }

        public Builder(ClassItemArgs defaults) {
            $ = new ClassItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The class item&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The class item&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClassItemArgs build() {
            return $;
        }
    }

}
