// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of an interstitial value between transforms in an execution stage.
 * 
 */
public final class ComponentSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentSourceArgs Empty = new ComponentSourceArgs();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @Import(name="originalTransformOrCollection")
    private @Nullable Output<String> originalTransformOrCollection;

    public Optional<Output<String>> originalTransformOrCollection() {
        return Optional.ofNullable(this.originalTransformOrCollection);
    }

    /**
     * Human-readable name for this transform; may be user or system generated.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private ComponentSourceArgs() {}

    private ComponentSourceArgs(ComponentSourceArgs $) {
        this.name = $.name;
        this.originalTransformOrCollection = $.originalTransformOrCollection;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentSourceArgs $;

        public Builder() {
            $ = new ComponentSourceArgs();
        }

        public Builder(ComponentSourceArgs defaults) {
            $ = new ComponentSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder originalTransformOrCollection(@Nullable Output<String> originalTransformOrCollection) {
            $.originalTransformOrCollection = originalTransformOrCollection;
            return this;
        }

        public Builder originalTransformOrCollection(String originalTransformOrCollection) {
            return originalTransformOrCollection(Output.of(originalTransformOrCollection));
        }

        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public ComponentSourceArgs build() {
            return $;
        }
    }

}
