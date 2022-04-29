// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes properties of an component as related to the standard
 * 
 */
public final class StandardComponentPropertiesArgs extends ResourceArgs {

    public static final StandardComponentPropertiesArgs Empty = new StandardComponentPropertiesArgs();

    /**
     * Component Key matching componentMetadata
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Component Key matching componentMetadata
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private StandardComponentPropertiesArgs() {}

    private StandardComponentPropertiesArgs(StandardComponentPropertiesArgs $) {
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardComponentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardComponentPropertiesArgs $;

        public Builder() {
            $ = new StandardComponentPropertiesArgs();
        }

        public Builder(StandardComponentPropertiesArgs defaults) {
            $ = new StandardComponentPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Component Key matching componentMetadata
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Component Key matching componentMetadata
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public StandardComponentPropertiesArgs build() {
            return $;
        }
    }

}
