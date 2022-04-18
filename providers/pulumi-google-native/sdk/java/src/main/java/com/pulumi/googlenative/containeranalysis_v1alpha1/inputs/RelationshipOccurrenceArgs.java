// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RelationshipOccurrence represents an SPDX Relationship section: https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/
 * 
 */
public final class RelationshipOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RelationshipOccurrenceArgs Empty = new RelationshipOccurrenceArgs();

    /**
     * A place for the SPDX file creator to record any general comments about the relationship
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> comment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there are "known unknowns", the use of the keyword NOASSERTION can be used The keywords NONE can be used to indicate that an SPDX element (package/file/snippet) has no other elements connected by some relationship to it
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> target() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    public RelationshipOccurrenceArgs(
        @Nullable Output<String> comment,
        @Nullable Output<String> source,
        @Nullable Output<String> target) {
        this.comment = comment;
        this.source = source;
        this.target = target;
    }

    private RelationshipOccurrenceArgs() {
        this.comment = Codegen.empty();
        this.source = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private @Nullable Output<String> source;
        private @Nullable Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }        public RelationshipOccurrenceArgs build() {
            return new RelationshipOccurrenceArgs(comment, source, target);
        }
    }
}
